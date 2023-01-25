package uk.co.metricrat.justbase64;

import android.util.Base64;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class JustBase64 extends AndroidNonvisibleComponent {

  public JustBase64(ComponentContainer container) {
      super(container.$form());
    }

    //BASE64
    @SimpleFunction(description = "encodes a text to base64")
    public String Base64TextEncode(String string) {
      String encodedString;
      encodedString = Base64.encodeToString(string.getBytes(), Base64.NO_WRAP);
      return encodedString;
    }
    @SimpleFunction(description = "decodes a base64String to text")
    public String Base64TextDecode(String base64String) {
      String decodedText;
      byte[] decodedBytes = Base64.decode(base64String, Base64.NO_WRAP);
      decodedText = new String(decodedBytes);
      return decodedText;
    }
  }
