# Calculadora con Android studio 

```javascript
                if (suma) {
                    cifra[contador] = buffer;
                    edt1.setText("");

                    if (resultado == 0) {
                        resultado = Double.parseDouble(cifra[contador - 1]) + Double.parseDouble(cifra[contador]);
                    } else {
                        resultado = Double.parseDouble(cifra[contador]) + resultado;
                    }

                    edt1.setText(String.valueOf(resultado));
                    suma = false;
                }
```       

<img src="https://github.com/JAlvarezGar/CalculadoraBasicaDroid/blob/master/pictures/Screenshot_1627486073.png" width="300px" />
