package com.apple.eawt;

import java.awt.Window;
import java.io.File;
import java.net.URI;
import java.util.EventObject;
import java.util.List;

public abstract class AppEvent extends EventObject {
   AppEvent() {
      super(null);
   }

   public static class AboutEvent extends AppEvent {
      AboutEvent() {
      }
   }

   public static class AppForegroundEvent extends AppEvent {
      AppForegroundEvent() {
      }
   }

   public static class AppHiddenEvent extends AppEvent {
      AppHiddenEvent() {
      }
   }

   public static class AppReOpenedEvent extends AppEvent {
      AppReOpenedEvent() {
      }
   }

   public abstract static class FilesEvent extends AppEvent {
      FilesEvent(List<File> files) {
      }

      public List<File> getFiles() {
         return null;
      }
   }

   public static class FullScreenEvent extends AppEvent {
      FullScreenEvent(Window window) {
      }

      public Window getWindow() {
         return null;
      }
   }

   public static class OpenFilesEvent extends AppEvent.FilesEvent {
      OpenFilesEvent(List<File> files, String s) {
         super(files);
      }

      public String getSearchTerm() {
         return null;
      }
   }

   public static class OpenURIEvent extends AppEvent {
      OpenURIEvent(URI uri) {
      }

      public URI getURI() {
         return null;
      }
   }

   public static class PreferencesEvent extends AppEvent {
      PreferencesEvent() {
      }
   }

   public static class PrintFilesEvent extends AppEvent.FilesEvent {
      PrintFilesEvent(List<File> files) {
         super(files);
      }
   }

   public static class QuitEvent extends AppEvent {
      QuitEvent() {
      }
   }

   public static class ScreenSleepEvent extends AppEvent {
      ScreenSleepEvent() {
      }
   }

   public static class SystemSleepEvent extends AppEvent {
      SystemSleepEvent() {
      }
   }

   public static class UserSessionEvent extends AppEvent {
      UserSessionEvent() {
      }
   }
}





