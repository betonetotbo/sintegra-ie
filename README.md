# sintegra-ie

Validador de IE para todos os estados brasileiros

## Validador de IE para todos os estados brasileiros

Todos os cálculos foram baseados nas informações que constam no site do Sintegra http://www.sintegra.gov.br

Esta biblioteca foi criada pela dificuldade nas validações de IE, pois são validações diferentes para cada estado, e a atual necessidade desta validação para uso com a NFe.

Mesmo nos casos onde as validações seriam iguais, exemplo módulo 11 de IE com 9 digitos, adotei criar uma classe separada para poder ajustar melhor futuras alterações que o estado possa fazer em seu validador.

Caso desejem existe também a Brazilutils que é uma biblioteca que tem validações de IE e mais alguns itens, porém criei esta aqui para ser mais específica da IE.