package Urok_dop;

import java.io.FileReader;

public class Circle {
 float calc(float pi1, int r1){
     Figura figura = new Figura();
     figura.pi = pi1;
     figura.r = r1;
     float v1 = 4/3*figura.pi*figura.r;
     return v1;

 }
}
