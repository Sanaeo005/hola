public class Algoritmo {
    // Método para convertir un número binario a decimal
           public static int binarioADecimal(String numeroBinario) {
           int longitud = numeroBinario.length();
           int decimal = 0;
    
           for (int i = 0; i < longitud; i++) {
                /** obtener el digito en la posicion en la que estamos */
                char digito = numeroBinario.charAt(i);
    
                /**Aquí ponemos si el digito es 0 o 1*/
                if (digito == '0') {
                /**Si el número es 0 no afecta a nuestro valor decimal entonces seguimos */
                continue;
                } else if (digito == '1') {
               /** ya cuando el número es 1 agregamos el valor adecuado al decimal y seguimos
             * al siguiente bloque
              */
              decimal += Math.pow(2, longitud - 1 - i);
              /**esto caalcula el valor de 2 elevado a la potencia de la longitud -1 -i
             * aquí la longitud la puse porque es la longitud de la cadena binaria y i es la
             * posicion actual del digito en la cadena
             * (-1 -i lo pongo para obtener la posiscion inversa de digito en la cadena binaria) )
             */
    
              } else {
              /**si hay un digito el cual sea invalido pongo un mensaje de error */
             System.out.println("No es válido el numero que colocaste");
             return -1;
              }
         }
    
         return decimal;
    }
    
       public static void main(String[] args) {
             /**pon un numero en binario que desees convertir en decimal */
             String numeroBinario = "1100";
             int decimal = binarioADecimal(numeroBinario);
    
             if (decimal != -1) {
            System.out.println("El número binario " + numeroBinario + " en decimal es: " + decimal);
            }
        }
    }
    