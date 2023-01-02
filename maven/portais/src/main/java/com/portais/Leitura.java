package com.portais;

import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;


import java.time.format.DateTimeFormatter;

public class Leitura implements Serializable{
    Cliente cliente;
    ArrayList<ArrayList<Integer>> historico;
    LocalDateTime startTime;
    LocalDateTime finishTime;
    String filename;
    String observations;

    public Leitura(Cliente cliente){
        this.cliente = cliente;
        cliente.leitura = this;
        historico = new ArrayList<ArrayList<Integer>>();
        startTime = LocalDateTime.now();
        filename = startTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME).replaceAll("-", "").replaceAll(":", "")+"_"+cliente.nome;
        observations = " ";
    }

    public void Save(){
        try{
            finishTime = LocalDateTime.now();
            File file= new File("portais/data/"+filename);
            if(!file.exists())
                file.createNewFile();
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(this);
            objectOut.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Leitura fromFile(String filepath){
        Leitura leitura = new Leitura(new Cliente());
        try {
            File file= new File(filepath);
            if(!file.exists())
                file.createNewFile();
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            leitura = (Leitura) objectIn.readObject();
            objectIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return leitura;
    }
}
