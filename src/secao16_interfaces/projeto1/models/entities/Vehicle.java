package secao16_interfaces.projeto1.models.entities;

public class Vehicle {
   private String Model;

   public Vehicle(){
   }

   public Vehicle(String Model) {
       this.Model = Model;
   }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}

