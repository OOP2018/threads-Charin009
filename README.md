## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |                    |                 |
| Using ReentrantLock     |                    |                 |
| Synchronized method      |                    |                 |
| AtomicLong for total    |                    |                 |

## 1. Using unsynchronized counter object
1.1 Yes ,the total should b zero
 but in unsynchronized counter total not always same.

1.2 In the table above.

1.3 Because we run addTask() and subtractTask() in threads so when we run it two of them didn't wait other one finish that make the result not always same when we run it.

For Example: We run threads-1(addTask) and threads-2(subtractTask) together ,and Counter is 5
.Both of them load 5 into register then threads-1 add Counter by 1 ,and threads-2 subtract Counter by 1 .Now threads-1 have Counter = 6 and threads-2 have Counter = 4 then then both of them send the result back if threads-2 finish before threads-1 Counter will be 4 and then replace it with 6 but sometime threads-1 finish before threads-2 the result will changed to 4.


## 2. Implications for Multi-threaded Applications

This behavior will affect Bank Applications when 2 user use same data from Bank Account in same times  

## 3. Counter with ReentrantLock
3.1 Yes ,the total always zero

3.2 Because we work on one thread then wait it done before work on other threads.

3.3 ReentrantLock will force your computer do thread that has lock before work on other threads when that thread has unlock.

3.4 To unlock threads that we work on.

## 4. Counter with synchronized method
4.1 Yes ,the total always zero

4.2 Because other threads will wait the working threads hav done before do something.

4.3 Synchronized made other methods or threads wait until the current thread done.


## 5. Counter with AtomicLong

5.1 Because in AtomicCounter we use AtomicLong that can perform 3 action(load ,change ,replace) very fast than other threads get the same resource.

5.2  Atomic can perform 3 action(load ,change ,replace) very fast than other threads get the same resource.We use it when we have many threads that want to use same resource.

## 6. Analysis of Results



## 7. Using Many Threads (optional)
