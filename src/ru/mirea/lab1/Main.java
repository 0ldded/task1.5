package ru.mirea.lab1;

public class Main
{
    public static void main(String[] args)
    {
        double res = 0;
        for(int i = 1; i <= 10; i++)
        {
            res = res + 1.0 / i;
            System.out.println(res);
        }
    }
}