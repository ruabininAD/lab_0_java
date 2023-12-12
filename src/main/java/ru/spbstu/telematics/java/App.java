package ru.spbstu.telematics.java;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

import java.io.*;


public class App
{
    public static void main( String[] args )
    {
        // Создание матрицы A
        double[][] matrixAData = { {1, 2, 3}, {4, 5, 6} };
        RealMatrix matrixA = new Array2DRowRealMatrix(matrixAData);

        // Создание матрицы B
        double[][] matrixBData = { {7, 8}, {9, 10}, {11, 12} };
        RealMatrix matrixB = new Array2DRowRealMatrix(matrixBData);

        // Умножение матриц A и B
        RealMatrix matrixResult = matrixA.multiply(matrixB);

        // Вывод результата умножения
        System.out.println("Результат умножения матриц A и B:");
        System.out.println(matrixResult);
        String matrixAsString = matrixResult.toString();
        try(FileWriter writer = new FileWriter("output.txt", false))
        {
           
            writer.write(matrixAsString);
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 

    }
}
