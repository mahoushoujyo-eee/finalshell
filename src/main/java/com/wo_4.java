package com;

import java.io.File;
import javax.swing.ImageIcon;

public class wo_4 {
   private final Object z = new Object();
   private File T;
   private boolean n = false;
   private boolean M = false;
   private ImageIcon r = null;
   private ImageIcon Y = null;

   public wo_4() {
   }

   public wo_4(File var1) {
      this.T = var1;
   }

   public File T() {
      return this.T;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void j(File var1) {
      String var10000 = com.Co_2.U();
      Object var3 = this.z;
      synchronized (this.z){} // $VF: monitorenter 
      String var2 = var10000;

      try {
         this.T = var1;
         var10000 = var1;
         if (var2 != null) {
            if (var1 == null) {
               this.n = false;
               this.M = false;
               this.r = null;
               this.Y = null;
            }

            var10000 = (String)var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public boolean Y() {
      synchronized (this.z) {
         return this.n;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void F(boolean var1) {
      String var10000 = com.Co_2.U();
      Object var3 = this.z;
      synchronized (this.z){} // $VF: monitorenter 
      String var2 = var10000;

      try {
         var10000 = this.T;
         if (var2 != null) {
            if (this.T != null) {
               this.n = var1;
            }

            var10000 = (String)var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public boolean Z() {
      synchronized (this.z) {
         return this.M;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void y(boolean var1) {
      String var10000 = com.Co_2.U();
      Object var3 = this.z;
      synchronized (this.z){} // $VF: monitorenter 
      String var2 = var10000;

      try {
         var10000 = this.T;
         if (var2 != null) {
            if (this.T != null) {
               this.M = var1;
            }

            var10000 = (String)var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public ImageIcon k() {
      synchronized (this.z) {
         return this.r;
      }
   }

   public void U(ImageIcon var1) {
      synchronized (this.z) {
         this.r = var1;
      }
   }

   public ImageIcon P() {
      synchronized (this.z) {
         return this.Y;
      }
   }

   public void C(ImageIcon var1) {
      synchronized (this.z) {
         this.Y = var1;
      }
   }

   public Object S() {
      return this.z;
   }
}





