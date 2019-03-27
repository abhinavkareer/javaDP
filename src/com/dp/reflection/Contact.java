package com.dp.reflection;

public class Contact {
    public String name;

    public String toString(){
        String ret="";
        if(this instanceof  Friend){
            ret = "Friend Name: "+name+" Ph: "+((Friend)this).phoneNumber;
        }else if(this instanceof  Work){
            ret = "Work Name: "+name+" Email: "+((Work)this).email;
        }else{
            ret ="ye kya ho gya?";
        }
        return  ret;
    }

}
