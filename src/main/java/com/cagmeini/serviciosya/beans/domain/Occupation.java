
package com.cagmeini.serviciosya.beans.domain;


public class Occupation {


    // Private instances fields.

    // Occupation id.
    private int id;

    // Occupation name.
    private String name;

    // Occupation description.
    private String description;


    // Constructor declarations.

    public Occupation () {

        // Call to super class.
        super ();
    }

    public Occupation (int id, String name, String description) {

        // Call to super class.
        super ();

        // Set internal values.
        this.id   = id;
        this.name = name;
        this.description = description;
    }


    // Getters and Setters declarations.

    public int getId () {

        return id;
    }

    public void setId (int id) {

        this.id = id;
    }

    public String getName () {

        return name;
    }

    public void setName (String name) {

        this.name = name;
    }

    public String getDescription () {

        return description;
    }

    public void setDescription (String description) {

        this.description = description;
    }

    @Override
    public String toString(){
        return  "ID: " + this.id +
                "\tNAME: " + this.name +
                "\tDESCRIPTION: " + this.description ;
    }
}