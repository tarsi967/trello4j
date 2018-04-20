package org.trello4j.model;

public class CustomFieldOption extends TrelloObject {

   private String idCustomField;
   private CustomFieldValue value;
   private String color;



   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public CustomFieldValue getValue() {
      return value;
   }

   public void setValue(CustomFieldValue value) {
      this.value = value;
   }

   public String getIdCustomField() {

      return idCustomField;
   }

   public void setIdCustomField(String idCustomField) {
      this.idCustomField = idCustomField;
   }


}
