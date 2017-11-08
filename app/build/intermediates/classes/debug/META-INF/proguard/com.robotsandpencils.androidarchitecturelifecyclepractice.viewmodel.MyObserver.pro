# Generated keep rule for Lifecycle observer adapter.
-keep class com.robotsandpencils.androidarchitecturelifecyclepractice.viewmodel.MyObserver_LifecycleAdapter {
   ifused class com.robotsandpencils.androidarchitecturelifecyclepractice.viewmodel.MyObserver {
       <init>(...);
   };
}
