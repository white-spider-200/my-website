/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;
import java.util.Scanner;
import java.util.Random;
public class xo {
        Scanner inp = new Scanner(System.in);
        Scanner plase=new Scanner(System.in);
        
        public boolean xoro(String che){
        if (che.toLowerCase().equals("o")|| che.toLowerCase().equals("x")){
            chose(che);
            return true;
        }
        else{
            
            System.err.println("wrong value");
            return false;
        }
    }
    private Random random = new Random();
        int ran = random.nextInt(10);
        private int time=0;    
        private final String [] m=new String[9];
        private char play,xplay;
        private boolean xp, y,ch,cho;
        private boolean sat=false;

    public void setXp(boolean xp) {
        this.xp = xp;
    }
        
       
    public void xplay(){
        
            int ran = random.nextInt(9);
            xp=true;
            if(xplay=='o')
               
                o(ran);
            else
                x(ran);
            
    }
        public boolean isY() {
        return y;
    }

    public char getPlay() {
        return play;
    }

    public char getXplay() {
        return xplay;
    }

    public void mzero(){
    for(int i =0;i<m.length;i++){
    m[i]="\t"+i+"\t";
    
    }
    
    };
    
    public void x(int c){
        if(chack(c)){
     m[c]="\tx\t";
     bord();
             y = true;
      time++;
             
        }
        else{
        if(!xp){
            System.out.println("""
           xxxxxxxxxxxxxxxxxxxxx
           xxxxxxxxxxxxxxxxxx
           xxxxxxxxxxxxxxxxxx
           you cant do this
                           try a gine :)""");}
        else{xplay();}
             y = false;
        }
    }
 public void o(int c){
     
    if(chack(c)){
     m[c]="\to\t";
    bord();
                 y = true;
                 time++;

    }
          else{
        if(!xp){
            System.out.println("""
           xxxxxxxxxxxxxxxxxxxxx
           xxxxxxxxxxxxxxxxxx
           xxxxxxxxxxxxxxxxxx
           you cant do this
                           try a gine :)""");}
        else{xplay();}
             y = false;
        }
     
    }

    /**
     *
     * @param c
     * @return
     */
    public boolean chack(int c){
    return !"\tx\t".equals(m[c])&&!"\to\t".equals(m[c]);
    
}
    public void bord(){
        System.out.println(m[0]+"|"+m[1]+"|"+m[2]);
        System.out.println("---------------------------------------------");
        System.out.println(m[3]+"|"+m[4]+"|"+m[5]);
        System.out.println("---------------------------------------------");
        System.out.println(m[6]+"|"+m[7]+"|"+m[8]);
    }
    public void chose(String c){
        if("x".equals(c)){
            play='x';
            xplay='o';}
        else if("o".equals(c)){
            play='o';
            xplay='x';
        }}
     public void resalt(){
         ch=false;
         cho=false;
if (m[0].equals("\tx\t") && m[1].equals("\tx\t") && m[2].equals("\tx\t")) {
    ch= true;
}
if (m[3].equals("\tx\t") && m[4].equals("\tx\t") && m[5].equals("\tx\t")) {
    ch= true;
}
if (m[6].equals("\tx\t") && m[7].equals("\tx\t") && m[8].equals("\tx\t")) {
    ch= true;
}
if (m[0].equals("\tx\t") && m[4].equals("\tx\t") && m[8].equals("\tx\t")) {
    ch= true;
}
if (m[2].equals("\tx\t") && m[4].equals("\tx\t") && m[6].equals("\tx\t")) {
    ch= true;
}

     if (m[0].equals("\to\t") && m[1].equals("\to\t") && m[2].equals("\to\t")) {
        cho = true;
    }
    if (m[3].equals("\to\t") && m[4].equals("\to\t") && m[5].equals("\to\t")) {
        cho = true;
    }
    if (m[6].equals("\to\t") && m[7].equals("\to\t") && m[8].equals("\to\t")) {
        cho = true;
    }
    if (m[0].equals("\to\t") && m[4].equals("\to\t") && m[8].equals("\to\t")) {
        cho = true;
    }
    if (m[2].equals("\to\t") && m[4].equals("\to\t") && m[6].equals("\to\t")) {
        cho = true;
    }
    if (cho) {
        System.out.println("o won");
    }
    if(ch){
    System.out.println("x won");
}
    if(!(time<=8))
             System.out.println("game over are tow people dident won");
    
    if(ch||cho||!(time<=8))
         sat=true;
}

    public boolean isSat() {
        return sat;
    }
    public void agine(){
        System.out.print("do you want to play agine yes if you want ?? ::");
        String ans=plase.nextLine().toLowerCase();
        if(ans.toLowerCase()=="yes")
            main();
        else
            System.out.println("the game end");
    }
public void main(){

 String cho;
      
        int i=0;
       
        mzero();
      bord();
         System.out.print("pls chose what do you want to pe x or o :: ");
           cho=inp.nextLine();
            while(!(xoro(cho))){
                System.out.print("pls chose what do you want to pe x or o :: ");
                cho=inp.nextLine();
                if(xoro(cho)){
                    chose(cho);
                }
            }
            
             System.out.println("you are :: "+getPlay());
            System.out.println("and the 2player  is :: "+ getXplay());
        plas2();
            
}
    

public void plas2(){
    while(true){
            setXp(false);
            System.out.print("chose a place ::");
            int pp=plase.nextInt();
            if(pp>=0&&pp<=8){
            if(getPlay()=='o'){
              o(pp);
        resalt();
        if(isSat())
                break;
            }
            else{
              x(pp);
              resalt();
        if(isSat())
                break;
            }
            if(isY()){
            System.out.println("player turn");
            xplay();
            
              resalt();       
if(isSat())
                break;
            }}else{
                System.err.println("pls entar a numper btwean 0 and 8");
                plas2();
            }

           
            
            

    
    }
}
}
