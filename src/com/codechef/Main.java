package com.codechef;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
	/*
	custom exception in bank transaction:
	 */
Scanner sc = new Scanner(System.in);
Transaction t1 = new Transaction();
t1.b = sc.nextInt();
t1.trans();
    }
}
class Transaction {
    int A = 1000;
    int b;

    int trans() throws Exception {
        if (b < A) throw new Exception("b can not be less than a");
        else {
            return b;
        }
    }
}
