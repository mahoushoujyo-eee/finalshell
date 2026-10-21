package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias("PluginVersion")
public class lO_3 implements Serializable {
   public static final com.lO_3 L = new com.lO_3(1, 0, 0);
   @XStreamAsAttribute
   private int C;
   @XStreamAsAttribute
   private int q;
   @XStreamAsAttribute
   private Integer H;

   public lO_3() {
      this.C = L.C;
      this.q = L.q;
      this.H = L.H;
   }

   public lO_3(int var1, int var2) {
      this.C = var1;
      this.q = var2;
      this.H = null;
   }

   public lO_3(int var1, int var2, Integer var3) {
      this.C = var1;
      this.q = var2;
      this.H = var3;
   }

   public int r() {
      return this.C;
   }

   public void L(int var1) {
      this.C = var1;
   }

   public int b() {
      return this.q;
   }

   public void E(int var1) {
      this.q = var1;
   }

   public Integer m() {
      return this.H;
   }

   public void R(Integer var1) {
      this.H = var1;
   }

   public boolean Z(com.lO_3 var1) {
      com.ky_4[] var2 = com.kZ_3.W();
      int var10000 = this.C;
      if (var2 == null) {
         label51:
         if (this.C <= var1.C) {
            var10000 = this.C;
            int var10001 = var1.C;
            if (var2 == null) {
               if (this.C == var1.C) {
                  if (var2 != null) {
                     return (boolean)this.q;
                  }

                  if (this.q > var1.q) {
                     break label51;
                  }
               }

               var10000 = this.C;
               var10001 = var1.C;
            }

            label86:
            if (var2 == null) {
               label84: {
                  if (var10000 == var10001) {
                     var10000 = this.q;
                     var10001 = var1.q;
                     if (var2 != null) {
                        break label86;
                     }

                     if (this.q == var1.q) {
                        var4 = this;
                        if (var2 != null) {
                           break label84;
                        }

                        if (this.H != null) {
                           var4 = var1;
                           if (var2 != null) {
                              break label84;
                           }

                           if (var1.H == null) {
                              break label51;
                           }
                        }
                     }
                  }

                  var4 = this;
               }

               var10000 = var4.C;
               var10001 = var1.C;
            }

            label94: {
               if (var2 == null) {
                  if (var10000 != var10001) {
                     return (boolean)0;
                  }

                  var5 = this;
                  if (var2 != null) {
                     break label94;
                  }

                  var10000 = this.q;
                  var10001 = var1.q;
               }

               if (var10000 != var10001) {
                  return (boolean)0;
               }

               var5 = this;
            }

            Integer var6 = var5.H;
            if (var2 == null) {
               if (var5.H != null) {
                  return (boolean)0;
               }

               var6 = var1.H;
            }

            if (var2 == null) {
               if (var6 == null) {
                  return (boolean)0;
               }

               var6 = this.H;
            }

            int var7 = var6;
            if (var2 != null) {
               return (boolean)var7;
            }

            if (var7 <= var1.H) {
               return (boolean)0;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   public boolean E(com.lO_3 var1) {
      com.ky_4[] var2 = com.kZ_3.W();
      boolean var10000 = this.a(var1);
      if (var2 == null) {
         if (!var10000) {
            var10000 = this.Z(var1);
            if (var2 != null) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean z(com.lO_3 var1) {
      com.ky_4[] var2 = com.kZ_3.W();
      int var10000 = var1.C;
      if (var2 == null) {
         label51:
         if (var1.C <= this.C) {
            var10000 = var1.C;
            int var10001 = this.C;
            if (var2 == null) {
               if (var1.C == this.C) {
                  if (var2 != null) {
                     return (boolean)var1.q;
                  }

                  if (var1.q > this.q) {
                     break label51;
                  }
               }

               var10000 = var1.C;
               var10001 = this.C;
            }

            label86:
            if (var2 == null) {
               label84: {
                  if (var10000 == var10001) {
                     var10000 = var1.q;
                     var10001 = this.q;
                     if (var2 != null) {
                        break label86;
                     }

                     if (var1.q == this.q) {
                        var4 = var1;
                        if (var2 != null) {
                           break label84;
                        }

                        if (var1.H != null) {
                           var4 = this;
                           if (var2 != null) {
                              break label84;
                           }

                           if (this.H == null) {
                              break label51;
                           }
                        }
                     }
                  }

                  var4 = var1;
               }

               var10000 = var4.C;
               var10001 = this.C;
            }

            label94: {
               if (var2 == null) {
                  if (var10000 != var10001) {
                     return (boolean)0;
                  }

                  var5 = var1;
                  if (var2 != null) {
                     break label94;
                  }

                  var10000 = var1.q;
                  var10001 = this.q;
               }

               if (var10000 != var10001) {
                  return (boolean)0;
               }

               var5 = var1;
            }

            Integer var6 = var5.H;
            if (var2 == null) {
               if (var5.H == null) {
                  return (boolean)0;
               }

               var6 = this.H;
            }

            if (var2 == null) {
               if (var6 == null) {
                  return (boolean)0;
               }

               var6 = var1.H;
            }

            int var7 = var6;
            if (var2 != null) {
               return (boolean)var7;
            }

            if (var7 <= this.H) {
               return (boolean)0;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   public boolean x(com.lO_3 var1) {
      com.ky_4[] var2 = com.kZ_3.W();
      boolean var10000 = this.a(var1);
      if (var2 == null) {
         if (!var10000) {
            var10000 = this.z(var1);
            if (var2 != null) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean a(com.lO_3 var1) {
      com.ky_4[] var2;
      int var10000;
      label34: {
         var2 = com.kZ_3.W();
         var10000 = var1.C;
         int var10001 = this.C;
         if (var2 == null) {
            if (var1.C != this.C) {
               return (boolean)0;
            }

            var10000 = var1.q;
            if (var2 != null) {
               break label34;
            }

            var10001 = this.q;
         }

         if (var10000 != var10001) {
            return (boolean)0;
         }

         var10000 = com.ax_2.Z(var1.H, new Object[]{this.H});
      }

      if (var2 != null) {
         return (boolean)var10000;
      } else {
         return (boolean)(var10000 != 0 ? 1 : 0);
      }
   }

   @Override
   public String toString() {
      com.ky_4[] var1 = com.kZ_3.W();
      StringBuilder var10000 = new StringBuilder().append("v").append(this.C);
      String var10001 = ".";
      if (var1 == null) {
         var10000 = var10000.append(".").append(this.q);
         var10001 = this.H != null ? "." + this.H : "";
      }

      return var10000.append(var10001).toString();
   }
}





