# Enunciado

Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um 
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser 
o instante do sistema: new Date().


# Estrutura do projeto

- `.../application/Program.java`: contém a estrutura principal do projeto, onde as classes serão instanciadas e utilizadas. Esta classe não possui nenhuma regra de negócio implementada.

- `.../entities/Client.java`: classe que implementa um cliente usando como informação o seu nome, email e data de nascimento. Esta entidade possui relacionamento apenas com a classe `Order`.

- `.../entities/Product.java`: classe que implementa um produto usando como informação o nome e o preço. Esta classe é **independente**.

- `.../entities/OrderItem.java`: esta classe implementa pedido de produtos, mas não o produto em si. As informações dela são quantidade, preço e produto. Esta última informação simboliza um relacionamento tem-um entre as classes `OrderItem` e `Product`. Além dos `getters` e `setters`, existe um método chamaod `Double subTotal()` onde é calculado o subtotal de cada pedido. Ou seja, instanciamos um objeto `Product` com nome "TV" e preço R$ 1.000,00. Atribuindo o valor de 3 para `quantity`, o método `subTotal` calculará apenas o R$ 1.000,00 x 3. E, por último, o método `String toString()` que é responsável por retornar uma string formatada com as principais informações.

- `.../entites/Order.java`: esta classe implementa um pedido, de fato. Os seus atributos são moment, status, cliente (relacionamento tem-um) e orderItems (relacionamento tem-vários). Além dos `getters` e `setters`, existem os métodos `void addItem()`, `void removeItem()` que são responsáveis por adicionar e remover os itens, respectivamente. O método `Double total()` é responsável por buscar o `subTotal()` lá do `OrderItem` e somar. Desta forma, conclui-se que este método vai retornar o valor total do pedido. Por último, para retornar a string formatada é usado o método `String toString()` usando também `StringBuilder`.

- `.../entities/enums/OrderStatus.java`: é uma `enum` com os status dos pedidos se está com pagamento pendente, processando, comprado ou entregue.