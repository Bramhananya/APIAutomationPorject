package com.mavenproject.apiautomation.utils;

import java.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EncodeDecodeUtils {

  private EncodeDecodeUtils() {
  }

  private static Logger log = LoggerFactory.getLogger(EncodeDecodeUtils.class);

  public static String getEncodedText(String strInputText) {
    try {
      Base64.Encoder encoder = Base64.getMimeEncoder();
      return encoder.encodeToString(strInputText.getBytes());
    } catch (Exception exception) {
      log.error(exception.getMessage());
      return null;

    }
  }

  // public static void main(String[] args) {
  // System.out.println(getEncodedText("shivanand.jangam@gmail.com"));
  // System.out.println(getDecodedText("c2hpdmFuYW5kLmphbmdhbUBnbWFpbC5jb20="));
  // }

  public static String getDecodedText(String strInputText) {
    try {
      Base64.Decoder decoder = Base64.getMimeDecoder();
      return new String(decoder.decode(strInputText));

    } catch (Exception exception) {
      log.error(exception.getMessage());
      return null;
    }
  }

  public static boolean isBase64EncriptedText(String strInputText) {
    try {
      new String(Base64.getDecoder().decode(strInputText));
      return true;
    } catch (Exception exception) {
      log.error(exception.getMessage());
      return false;
    }
  }
}
