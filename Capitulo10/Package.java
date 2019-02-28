/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo10;

/**
 *
 * @author luisl
 */
public class Package {
    private Double weight;
    private Double cost=0.0;
    private ShippingMethod method;
    
    public Package(Double weight,ShippingMethod method){
        this.weight=weight;
        this.method=method;
        this.cost+=calculateCost();
    }
    
    private Double calculateCost(){
        double res;
        if(this.getMethod()==ShippingMethod.A){
            if(this.getWeight()>=0.0&&this.getWeight()<9.0){
                res=2.00;
            }else if(this.getWeight()<17.0){
                res=3.0;
            }else{
                res=4.5;
            }
        }
        else if(this.getMethod()==ShippingMethod.M){
            if(this.getWeight()>=0.0&&this.getWeight()<9.0){
                res=1.5;
            }else if(this.getWeight()<17.0){
                res=2.35;
            }else{
                res=3.25;
            }
        }else{
            if(this.getWeight()>=0.0&&this.getWeight()<9.0){
                res=0.5;
            }else if(this.getWeight()<17.0){
                res=1.5;
            }else{
                res=2.15;
            }
        }
        return res;
    }
    
    public void display(){
        System.out.println("Shipping Method: "+this.getMethod()+"\nPackage weight: "+this.getWeight()+"\nShipping cost: $"+this.getCost());
    }

    /**
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * @return the cost
     */
    public Double getCost() {
        return cost;
    }
    
    void setCost(double cost){
        this.cost+=cost;
    }

    /**
     * @return the method
     */
    public ShippingMethod getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(ShippingMethod method) {
        this.method = method;
    }
    
    
}
