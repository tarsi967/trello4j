package org.trello4j.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UnknownFormatConversionException;

public class CustomFieldValue {
   private String text;
   private String number;
   private String date;
   private String checked;

  public <T> T get(Class<T> type) {
     if(type.isAssignableFrom(String.class))
        return (T) (text!=null?text:"");
     else if(type.isAssignableFrom(BigDecimal.class))
        return (T) (number!=null?new BigDecimal(number):BigDecimal.ZERO);
     else if(type.isAssignableFrom(Date.class))
        throw new UnknownFormatConversionException("DATE NYI"); //TODO
     else if(type.isAssignableFrom(Boolean.class)) {
        return (T) (checked!=null?new Boolean(checked):Boolean.FALSE);
     }
     //TODO exception
     return  null;
   }

   public String getAsString() {
     if(text!=null)
        return text;
     else if (number!=null)
        return number;
     else if (date!=null)
        return date;
     else if (checked!=null)
        return checked;
     else
        return null;
   }

}
