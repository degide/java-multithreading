## <b style="color: skyblue">Notes on Java Multi-Threading</b>

### It all start by Runnable interface.

<b style="color: orange">A thread</b> is a process that is capable of running on its own in the
processor. By using threads we become able of implementing asynchronous feature where
a process doesn't need to wait for another to finnish.

<b>The <i style="color: orange">Thread</i> class implements the <i style="color: skyblue">Runnable</i> Interface</b>. This means that
the Thread class is Runnable. The main difference between Runnable interface and Thread class,
is that the Thread class contains start() method while in implementing Runnable interface
we have to define start method by our own.

Every thread must have a run method, and a start method.
The start() method is used to move a thread from new state to running state.
<b>The run() method is used to contain all the actual task of the thread to mean what code the thread will
be executing.</b>

Once a thread is created it comes in <b style="color: yellow">new state</b>, when the start() method is called,
the thread moves from new state to <b style="color: yellow">running</b> state. After, when it finishes its tasks in run() method,
or we call the stop() method, it comes from running state to <b style="color: yellow">dead</b> state.