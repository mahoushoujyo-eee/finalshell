package com.finalshell.core;
import com.finalshell.reflect.Ref;

import com.finalshell.reflect.Registry;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.hc.client5.http.SystemDefaultDnsResolver;

public class V5 extends SystemDefaultDnsResolver {
   @Override
   public InetAddress[] resolve(String var1) throws UnknownHostException {
      try {
         if (var1.equals((String)Ref.g(381524296324133692L, null))) {
            return super.resolve((String)Ref.g(434787546011183607L, null));
         }
      } catch (UnknownHostException var2) {
         throw new RuntimeException(a(var2));
      }

      return super.resolve(var1);
   }

   public static UnknownHostException a(UnknownHostException var0) {
      return var0;
   }
}





