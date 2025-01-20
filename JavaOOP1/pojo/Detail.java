/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op;

/**
 *
 * @author HP
 */
public class Detail 
{
    String name;
    Long id;
    String cast;

    public Detail(String name, Long id, String cast) {
        this.name = name;
        this.id = id;
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Detail{" + "name=" + name + ", id=" + id + ", cast=" + cast + '}';
    }
    
    

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getCast() {
        return cast;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
    
    
    
    
}
