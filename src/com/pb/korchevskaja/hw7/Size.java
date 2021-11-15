package com.pb.korchevskaja.hw7;

public enum Size {
    XXS("xxs", "32"),
    XS("xs", "34"),
    S("s", "36"),
    M("m", "38"),
    L("l", "40");
    private String description;
    private String euroSize;
    Size(String description, String euroSize){
        this.description = description;
        this.euroSize = euroSize;
    }
    public void getDescription(String description) {
        if(description == this.XXS.description){
            System.out.println("Детская одежда");
        } else{
            System.out.println("Взрослая одежда");
        }
    }
    public void getEuroSize(String description) {
        if(description == this.XXS.description){
            System.out.println(this.XXS.euroSize);
        } else if(description == this.XS.description){
            System.out.println(this.XS.euroSize);
        }else if(description == this.S.description){
            System.out.println(this.S.euroSize);
        }else if(description == this.L.description){
            System.out.println(this.L.euroSize);
        }else {
            System.out.println(this.M.euroSize);
        }
    }
}
