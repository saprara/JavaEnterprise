/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raksh
 */
public class StatisticModel {
     int sample;
     int population;
    double probability;
     double combination;
     double permutation;
      int diff=population-sample;
     
    //this method has the formulas for all 3 buttons
    public  StatisticModel(int n,int r){
        this.sample=r;
        this.population=n;
    
        
    }



    
    

    
   //this method helps get the factorial
    public int getFactorial(int f){
        int fact=1;
        for(int i=1;i<=f;i++){
            fact*=i;  
        }
        return fact;
    }

    /**
     * @return the probability
     */
    public double getProbability() {
         probability=sample/population;
        return probability;
    }

    /**
     * @return the combination
     */
    public double getCombination() {
                 combination=(getFactorial(population))/(getFactorial(diff)*getFactorial(sample));

        return combination;
    }

    /**
     * @return the permutation
     */
    public double getPermutation() {
                 permutation=getFactorial(population)/getFactorial(diff);

        return permutation;
    }

    /**
     * @return the sample
     */
    public int getSample() {
        return sample;
    }

    /**
     * @param sample the sample to set
     */
    public void setSample(int sample) {
        this.sample = sample;
    }

    /**
     * @return the population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(int population) {
        this.population = population;
    }
    
    
}
