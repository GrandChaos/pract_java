package ru.sbrf.intership.lesson1.example3;

public class Consumer extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 100_0000; i++)
        {
            Buffer.decrement();
        }
    }
}
