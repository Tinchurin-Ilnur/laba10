package com.company;
import java.util.Scanner;
import java.io. *;

public class Main {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ip-address");
        String input = in.nextLine();
boolean result=input.matches("(((1[0-9][0-9])|(2[0-5][0-5]))\\.){3}((1[0-9][0-9])|(2[0-5][0-5]))");
if(result) {
            System.out.println("OK");
        }
else{
            System.out.println("Error");
        }
try (BufferedWriter bw = new BufferedWriter(new FileWriter("ID.txt"))){
            bw.write(input);
        }
catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        String g = in.nextLine();
if (g.equals("load")){
try(BufferedReader br = new BufferedReader(new FileReader("ID.txt"))){
                String I;
while ((I = br.readLine())!= null){
                    System.out.println(I);
                }

            }
catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}