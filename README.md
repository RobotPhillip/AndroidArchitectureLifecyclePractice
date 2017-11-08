# AndroidArchitectureLifecyclePractice

This project is practice using lifecycle functionality, as presented by this article.

https://proandroiddev.com/architecture-components-modelview-livedata-33d20bdcc4e9

# What I learned

At some time in the past 6 months, the prototypical lifecycle classes, like `LifecycleActivity` and `LifecycleFragment`, were
deprecated.  Their logic has now been rolled into the main android classes.  Now, `android.support.v7.app.AppCompatActivity`,
in its implementation hierarchy, implements `LifecycleOwner`.

## Control Case

Prior to the lifecycle architecture, developers had to roll their own approach to preserve state.  Methods like
`onSaveInstanceState(Bundle outState)` or `onRestoreInstanceState(Bundle savedInstanceState)` would contain logic to
record the current state or apply the stored state, respectively.  `DemoActivity` exercises this case

## ViewModel Solution

By creating a view model class that extends `android.arch.lifecycle.ViewModel` and registering it with your lifecycle-aware
view (activity/fragment), the lifecycle information can be preserved when the view is destroyed and created.

The key line is:
`viewModel = ViewModelProviders.of(this).get(SomeViewModel.class);`

ViewModelProviders instantiates the view model the first time, then gets it from a `Map` therein.

## ViewModel with dependencies

This utilizes a factory pattern to create the instances of the objects that will be 'injected' into the view model.
The factory is then passed to the lifecycle mapping call to instruct the lifecycle of how to create the view model.
The factory must implement `ViewModelProvider.Factory`.

`
SomeFactory factory = new SomeFactory(new NecessaryDependency());
viewModel = ViewModelProviders.of(this, factory).get(SomeViewModel.class);
`

## LiveData

Quote from the article:

"`LiveData` allows your `LifecycleOwner` to receive updates from your `ViewModel` by observing the changes while the 
`Activity` is `Started` or `Resumed`.
`LiveData` manages observer subscriptions by pausing subscriptions to stopped `LifecycleOwner`
objects, and cancelling subscriptions to `LifecycleOwner` objects in `onDestroy()`."

The view (`Activity` or `Fragment`) then observes on the `LiveData` object.
It needs an `Observer` object.
eg)
`liveDataTimerViewModel.getElapsedTime().observe(this, elapsedTimeObserver);`

## LifecycleObserver

Multiple observers can watch lifecycle changes.  Observers must implement `android.arch.lifecycle.LifecycleObserver`.

Quote from the article:

"And to associate the `LifecycleOwner` with the `LifecycleObserver`, you’d use the following statement (usually in your
`Activity`’s `onCreate()`): `getLifecycle().addObserver(new MyObserver())`."
