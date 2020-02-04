/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class SIBean implements Serializable{
    private float p;
    private float r;
    private float t;

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }
    
    
}
