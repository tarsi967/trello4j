package org.trello4j.model;

public class CustomFieldItem extends TrelloObject {

   private String idValue;
   private String idCustomField;
   private String idModel;
   private String modelType;

   private CustomFieldValue value;
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public CustomFieldValue getValue() {
      return value;
   }

   public void setValue(CustomFieldValue value) {
      this.value = value;
   }

   public String getIdValue() {
      return idValue;
   }

   public void setIdValue(String idValue) {
      this.idValue = idValue;
   }

   public String getIdCustomField() {
      return idCustomField;
   }

   public void setIdCustomField(String idCustomField) {
      this.idCustomField = idCustomField;
   }

   public String getIdModel() {
      return idModel;
   }

   public void setIdModel(String idModel) {
      this.idModel = idModel;
   }

   public String getModelType() {
      return modelType;
   }

   public void setModelType(String modelType) {
      this.modelType = modelType;
   }

}
