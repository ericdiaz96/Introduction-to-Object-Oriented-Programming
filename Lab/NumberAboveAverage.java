import java.util.Scanner;
public class NumberAboveAverage{
public static void main(String[] args) 
{
final int NUMBER_OF_TEMPERATURES = 10;
double[] temperature = new double[NUMBER_OF_TEMPERATURES];
int temperatureCount = 0;
double total = 0;

//Reads temperature & counts entries.
Scanner input = new Scanner(System.in);
for (int i = 0; i < temperature.length; i++)
{
    System.out.println("Enter ten temperature values:");
    temperature[i] = input.nextDouble();
    total = total + temperature[i];
    temperatureCount++;
}

//Computes the average 
double averageTemp = total/NUMBER_OF_TEMPERATURES;
System.out.println("The average temperature is " + averageTemp); 

//Displays temperatures above average. 
System.out.println("The temperatures above average are as follows: ");
for (int i = 0; i < temperature.length; i++)
{
    if (temperature[i]> averageTemp)
        System.out.println("Day " + (i + 1) + " had a temperature " + temperature[i]+ " which was above average");
}
}
}