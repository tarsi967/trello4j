package org.trello4j.model;

import java.util.List;

public class CustomField extends TrelloObject {

   public enum FieldType {checkbox, date, list, number, text};

   private String idModel;
   private String fieldGroup;
   private String name;
   private List<CustomFieldOption> options;
   private FieldType type;

   public boolean hasOptions() {
      return options!=null && options.size()>0;
   }

   public String getIdModel() {
      return idModel;
   }

   public void setIdModel(String idModel) {
      this.idModel = idModel;
   }

   public String getFieldGroup() {
      return fieldGroup;
   }

   public void setFieldGroup(String fieldGroup) {
      this.fieldGroup = fieldGroup;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<CustomFieldOption> getOptions() {
      return options;
   }

   public void setOptions(List<CustomFieldOption> options) {
      this.options = options;
   }

   public FieldType getType() {
      return type;
   }

   public void setType(FieldType type) {
      this.type = type;
   }


}
