package DesignPattern.CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String name;
    List<FileSystem> list;

    public Directory(String name){
        this.name = name;
        this.list = new ArrayList<>();
    }

    @Override
    public void ls(){

        System.out.println("Directory name : " + name);

        for(FileSystem fsObject : list){

            fsObject.ls();
        }
    }

    public void add(FileSystem obj){

        list.add(obj);
    }
}
