package com.apple.eawt;

import java.awt.Image;
import java.awt.Point;
import java.awt.PopupMenu;
import javax.swing.JMenuBar;

public class Application {
   public static Application getApplication() {
      return null;
   }

   public void addAppEventListener(AppEventListener listener) {
   }

   public void removeAppEventListener(AppEventListener listener) {
   }

   public void setAboutHandler(AboutHandler handler) {
   }

   public void setPreferencesHandler(PreferencesHandler handler) {
   }

   public void setOpenFileHandler(OpenFilesHandler handler) {
   }

   public void setPrintFileHandler(PrintFilesHandler handler) {
   }

   public void setOpenURIHandler(OpenURIHandler handler) {
   }

   public void setQuitHandler(QuitHandler handler) {
   }

   public void setQuitStrategy(QuitStrategy strategy) {
   }

   public void enableSuddenTermination() {
   }

   public void disableSuddenTermination() {
   }

   public void requestForeground(boolean b) {
   }

   public void requestUserAttention(boolean b) {
   }

   public void openHelpViewer() {
   }

   public void setDockMenu(PopupMenu menu) {
   }

   public PopupMenu getDockMenu() {
      return null;
   }

   public void setDockIconImage(Image image) {
   }

   public Image getDockIconImage() {
      return null;
   }

   public void setDockIconBadge(String s) {
   }

   public void setDefaultMenuBar(JMenuBar bar) {
   }

   @Deprecated
   public void addApplicationListener(ApplicationListener listener) {
   }

   @Deprecated
   public void removeApplicationListener(ApplicationListener listener) {
   }

   @Deprecated
   public void setEnabledPreferencesMenu(boolean b) {
   }

   @Deprecated
   public void setEnabledAboutMenu(boolean b) {
   }

   @Deprecated
   public boolean getEnabledPreferencesMenu() {
      return false;
   }

   @Deprecated
   public boolean getEnabledAboutMenu() {
      return false;
   }

   @Deprecated
   public boolean isAboutMenuItemPresent() {
      return false;
   }

   @Deprecated
   public void addAboutMenuItem() {
   }

   @Deprecated
   public void removeAboutMenuItem() {
   }

   @Deprecated
   public boolean isPreferencesMenuItemPresent() {
      return false;
   }

   @Deprecated
   public void addPreferencesMenuItem() {
   }

   @Deprecated
   public void removePreferencesMenuItem() {
   }

   @Deprecated
   public static Point getMouseLocationOnScreen() {
      return null;
   }
}





