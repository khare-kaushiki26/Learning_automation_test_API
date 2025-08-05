package com.kaushiki.khare.sample.ex_02_RA_Concepts;
//  Builder Pattern is basically the pattern where we can use different functions
//  by using dot operator accessed by the object of the class.
// Every function of a builder pattern returns the instance of the same function , which is why a chain is developed
//The crucial part is that each method returns `this` (the Builder object itself).
// This allows for method chaining.

public class Builder_patten_RA {
    public Builder_patten_RA step1()
    {
        System.out.println("Step 1");
        return this;
    }
    public Builder_patten_RA step2()
    {
        System.out.println("Step 2");
        return this;
    }
    public Builder_patten_RA step3(String param1)
    {
        System.out.println("Step 3 " + param1);
        return this;
    }

    public static void main(String[] args) {
        Builder_patten_RA nbp = new Builder_patten_RA();

        nbp.step1().step2().step3("Test");

    }

}
