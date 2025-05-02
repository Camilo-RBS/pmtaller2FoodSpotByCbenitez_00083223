package com.pmdtaller2.CamiloBenitez_00083223.model

object RestaurantRepository {

    val restaurants = listOf(
        // Comida Rápida
        Restaurant(
            id = 1,
            name = "Taco Loco",
            description = "Auténtica comida mexicana con tacos y burritos",
            category = "Comida Mexicana",
            imageUrl = "https://img.freepik.com/vector-premium/diseno-logotipo-taco-contorno-negrita-emblema-circulo_1594-802.jpg?semt=ais_hybrid&w=740", // Taco al Pastor
            menu = listOf(
                MenuItem(1, "Taco al Pastor", "Delicioso taco con carne al pastor", "https://upload.wikimedia.org/wikipedia/commons/7/73/001_Tacos_al_pastor_%28cropped%29.jpg"),
                MenuItem(2, "Burrito de Pollo", "Burrito con pollo y frijoles", "https://img.freepik.com/vector-premium/diseno-logotipo-taco-contorno-negrita-emblema-circulo_1594-802.jpg?semt=ais_hybrid&w=740"),
                MenuItem(3, "Quesadilla de Pollo", "Quesadilla con pollo y queso derretido", "https://upload.wikimedia.org/wikipedia/commons/0/06/Quesadilla_de_pollo.jpg")
            )
        ),
        Restaurant(
            id = 2,
            name = "Pizza Planeta",
            description = "Pizzas artesanales con ingredientes frescos",
            category = "Comida Italiana",
            imageUrl = "https://1000marcas.net/wp-content/uploads/2025/02/Pizza-Planet-Emblem.png", // Pizza Margherita
            menu = listOf(
                MenuItem(4, "Pizza Margarita", "Pizza clásica con tomate y mozzarella", "https://upload.wikimedia.org/wikipedia/commons/a/a3/Eq_it-na_pizza-margherita_sep_2005_sml.jpg"),
                MenuItem(5, "Pizza Pepperoni", "Pizza con pepperoni y queso", "https://upload.wikimedia.org/wikipedia/commons/d/d4/Pepperoni-Pizza.jpg"),
                MenuItem(6, "Pizza 4 Estaciones", "Pizza con jamón, champiñones, pimientos y aceitunas", "https://upload.wikimedia.org/wikipedia/commons/5/56/Pizza_quattro_stagioni.jpg")
            )
        ),
        Restaurant(
            id = 3,
            name = "Burger King",
            description = "Hamburguesas a la parrilla con sabor único",
            category = "Comida Rapida",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4-yUahcPQgEG7Kso9xVT8iaMjIbOxLEsp1Q&s", // Whopper con queso
            menu = listOf(
                MenuItem(7, "Whopper", "Hamburguesa con carne a la parrilla, lechuga y tomate", "https://upload.wikimedia.org/wikipedia/commons/c/c4/Whopper_with_Cheese.jpeg"),
                MenuItem(8, "Papas Fritas", "Clásicas papas fritas crujientes", "https://upload.wikimedia.org/wikipedia/commons/b/b8/French_fries.jpg"),
                MenuItem(9, "Chicken Nuggets", "Nuggets de pollo con salsa barbacoa", "https://upload.wikimedia.org/wikipedia/commons/3/3d/Chicken_nuggets.jpg")
            )
        ),
        Restaurant(
            id = 4,
            name = "Pollo Campero",
            description = "Pollo frito tradicional con sabor centroamericano",
            category = "Comida Rapida",
            imageUrl = "https://assets.simpleviewinc.com/simpleview/image/upload/crm/virginia/pollo-campero2_d529c6cb-5056-a36a-07296f1d253fe6e0.jpg", // Pollo frito
            menu = listOf(
                MenuItem(10, "Pollo Frito", "Pieza de pollo crujiente y jugosa", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Pollo_frito_dominicano.jpg/800px-Pollo_frito_dominicano.jpg"),
                MenuItem(11, "Empanadas de Pollo", "Empanadas rellenas de pollo y maíz", "https://upload.wikimedia.org/wikipedia/commons/1/12/Chicken_empanadas.jpg"),
                MenuItem(12, "Tostones", "Plátanos fritos con salsa", "https://upload.wikimedia.org/wikipedia/commons/9/9c/Tostones.jpg")
            )
        ),
        // Comida Mexicana
        Restaurant(
            id = 5,
            name = "El Burrito Loco",
            description = "Comida mexicana con burritos y tacos",
            category = "Comida Mexicana",
            imageUrl = "https://static.vecteezy.com/system/resources/previews/015/595/403/non_2x/burrito-logo-template-suitable-for-restaurant-food-truck-and-cafe-vector.jpg", // Burrito
            menu = listOf(
                MenuItem(13, "Burrito de Carne Asada", "Burrito con carne asada y guacamole", "https://upload.wikimedia.org/wikipedia/commons/4/43/Burrito_asada.jpg"),
                MenuItem(14, "Taco de Pescado", "Taco con pescado frito y salsa", "https://upload.wikimedia.org/wikipedia/commons/4/43/Taco_de_pescado.jpg"),
                MenuItem(15, "Guacamole", "Guacamole con totopos", "https://upload.wikimedia.org/wikipedia/commons/0/0c/Guacamole.jpg")
            )
        ),
        Restaurant(
            id = 6,
            name = "La Casa del Tacos",
            description = "Restaurante especializado en tacos tradicionales",
            category = "Comida Mexicana",
            imageUrl = "https://static.vecteezy.com/system/resources/previews/010/367/923/non_2x/burrito-logo-for-any-business-especially-for-food-and-beverage-food-truck-restaurant-cafe-etc-vector.jpg", // Tacos
            menu = listOf(
                MenuItem(16, "Taco de Carnitas", "Taco con carne de cerdo y salsa verde", "https://upload.wikimedia.org/wikipedia/commons/5/59/Taco_de_carnitas.jpg"),
                MenuItem(17, "Taco de Barbacoa", "Taco con carne de res y salsa roja", "https://upload.wikimedia.org/wikipedia/commons/d/d7/Taco_barbacoa.jpg"),
                MenuItem(18, "Sopes", "Sopes con frijoles, carne y salsa", "https://upload.wikimedia.org/wikipedia/commons/4/4f/Sopes.jpg")
            )
        ),
        Restaurant(
            id = 7,
            name = "La Taquería",
            description = "Tacos con todo tipo de carnes y salsa especial",
            category = "Comida Mexicana",
            imageUrl = "https://t3.ftcdn.net/jpg/06/46/87/84/360_F_646878436_DW1KsYTM2J99NYFqKUdH2kcBlqSoljfN.jpg", // Tacos
            menu = listOf(
                MenuItem(19, "Taco de Suadero", "Taco con carne suculenta y salsa picante", "https://upload.wikimedia.org/wikipedia/commons/4/4d/Taco_de_suadero.jpg"),
                MenuItem(20, "Taco de Lengua", "Taco con carne de lengua y cebolla", "https://upload.wikimedia.org/wikipedia/commons/5/5e/Taco_de_lengua.jpg"),
                MenuItem(21, "Taco Dorado", "Taco frito con carne y crema", "https://upload.wikimedia.org/wikipedia/commons/c/c9/Taco_dorado.jpg")
            )
        ),
        Restaurant(
            id = 8,
            name = "El Rincón Mexicano",
            description = "Comida mexicana tradicional con tortillas y salsas",
            category = "Comida Mexicana",
            imageUrl = "https://logopond.com/logos/59aad35faa5372c94ee30e4876d977b9.png", // Comida Mexicana
            menu = listOf(
                MenuItem(22, "Taco de Mole", "Taco con mole y carne de pollo", "https://upload.wikimedia.org/wikipedia/commons/a/a1/Taco_de_mole.jpg"),
                MenuItem(23, "Queso Fundido", "Queso fundido con chorizo", "https://upload.wikimedia.org/wikipedia/commons/2/2f/Queso_fundido.jpg"),
                MenuItem(24, "Chilaquiles", "Tortillas fritas con salsa y pollo", "https://upload.wikimedia.org/wikipedia/commons/4/47/Chilaquiles.jpg")
            )
        ),
        // Comida Italiana
        Restaurant(
            id = 9,
            name = "La Trattoria",
            description = "Pasta fresca y pizzas tradicionales italianas",
            category = "Comida Italiana",
            imageUrl = "https://img.freepik.com/vector-premium/diseno-logotipo-culinario-comida-italiana-retro-vintage_467060-768.jpg?semt=ais_hybrid&w=740", // Pizza Margherita
            menu = listOf(
                MenuItem(25, "Pasta Carbonara", "Pasta con salsa cremosa de huevo y panceta", "https://upload.wikimedia.org/wikipedia/commons/e/eb/Pasta_carbonara.jpg"),
                MenuItem(26, "Pizza Boscaiola", "Pizza con champiñones y jamón", "https://upload.wikimedia.org/wikipedia/commons/5/54/Pizza_boscaiola.jpg"),
                MenuItem(27, "Lasagna", "Lasagna de carne con salsa bechamel", "https://upload.wikimedia.org/wikipedia/commons/f/f7/Lasagna.jpg")
            )
        ),
        Restaurant(
            id = 10,
            name = "Pasta & Pizza",
            description = "Comida italiana fresca y deliciosa",
            category = "Comida Italiana",
            imageUrl = "https://img.freepik.com/vector-premium/circulo-tenedor-geometrico-redondeado-cocina-italiana-estilo-simple-minimalista-plano-limpio-diseno-logotipo-moderno-ilustracion-icono-vectorial_15473-18819.jpg?semt=ais_hybrid&w=740", // Pasta & Pizza
            menu = listOf(
                MenuItem(28, "Pasta Puttanesca", "Pasta con salsa de tomate y aceitunas", "https://upload.wikimedia.org/wikipedia/commons/5/5f/Pasta_puttanesca.jpg"),
                MenuItem(29, "Pizza Quattro Formaggi", "Pizza con cuatro tipos de queso", "https://upload.wikimedia.org/wikipedia/commons/7/75/Quattro_formaggi_pizza.jpg"),
                MenuItem(30, "Ravioli de Ricotta", "Ravioli relleno de ricotta con salsa de tomate", "https://upload.wikimedia.org/wikipedia/commons/4/43/Ravioli_ricotta.jpg")
            )
        ),
        Restaurant(
            id = 11,
            name = "Cucina Italiana",
            description = "Pasta y pizza artesanal, tradición italiana",
            category = "Comida Italiana",
            imageUrl = "https://www.logotypes101.com/logos/204/D651CBF71E8619F421D39AD0886B827D/italia.png", // Lasagna
            menu = listOf(
                MenuItem(31, "Lasagna Bolognese", "Lasagna con carne y salsa bolognesa", "https://upload.wikimedia.org/wikipedia/commons/9/96/Lasagna_italiana.jpg"),
                MenuItem(32, "Pizza Margherita", "Pizza con tomate, mozzarella y albahaca", "https://upload.wikimedia.org/wikipedia/commons/a/a3/Eq_it-na_pizza-margherita_sep_2005_sml.jpg"),
                MenuItem(33, "Frittura di Mare", "Fritura de mariscos", "https://upload.wikimedia.org/wikipedia/commons/f/f3/Frittura_di_mare.jpg")
            )
        ),
        Restaurant(
            id = 12,
            name = "Bello Gusto",
            description = "Comida italiana con platos auténticos",
            category = "Comida Italiana",
            imageUrl = "https://img.freepik.com/vector-gratis/genial-logotipo-tipografia-restaurante-italiano_742173-4129.jpg", // Pasta
            menu = listOf(
                MenuItem(34, "Spaghetti Aglio e Olio", "Spaghetti con ajo, aceite de oliva y guindilla", "https://upload.wikimedia.org/wikipedia/commons/a/a9/Spaghetti_aglio_olio.jpg"),
                MenuItem(35, "Pizza Capricciosa", "Pizza con jamón, alcachofas y aceitunas", "https://upload.wikimedia.org/wikipedia/commons/c/c0/Pizza_capricciosa.jpg"),
                MenuItem(36, "Tiramisu", "Tiramisu tradicional italiano", "https://upload.wikimedia.org/wikipedia/commons/3/33/Tiramisu_2012.jpg")
            )
        ),
        // Comida Asiática
        Restaurant(
            id = 13,
            name = "Sushi Time",
            description = "Sushi fresco y platos orientales",
            category = "Comida Asiatica",
            imageUrl = "https://img.freepik.com/vector-premium/logotipos-comida-asiatica-dibujados-mano-vector-premium_514761-236.jpg", // Sushi
            menu = listOf(
                MenuItem(37, "Sushi California", "Sushi con aguacate, pepino y cangrejo", "https://upload.wikimedia.org/wikipedia/commons/a/a4/California_roll_sushi.jpg"),
                MenuItem(38, "Sushi Nigiri", "Sushi con pescado crudo", "https://upload.wikimedia.org/wikipedia/commons/f/f5/Nigiri_sushi.jpg"),
                MenuItem(39, "Tempura", "Verduras y camarones empanizados", "https://upload.wikimedia.org/wikipedia/commons/e/ec/Tempura_shrimp.jpg")
            )
        ),Restaurant(
            id = 14,
            name = "Sushi World",
            description = "Sushi fresco y platos tradicionales japoneses",
            category = "Comida Asiatica",
            imageUrl = "https://uploads.turbologo.com/uploads/design/preview_image/3291269/preview_image20210708-27119-1unnvn2.png", // Sushi
            menu = listOf(
                MenuItem(25, "Sushi California Roll", "Roll de sushi con aguacate, pepino y cangrejo", "https://upload.wikimedia.org/wikipedia/commons/a/a0/Sushi_platter.jpg"),
                MenuItem(26, "Sashimi de Atún", "Finas láminas de atún fresco", "https://upload.wikimedia.org/wikipedia/commons/1/1f/Sashimi.jpg"),
                MenuItem(27, "Tempura de Camarón", "Camarones empanizados y fritos al estilo tempura", "https://upload.wikimedia.org/wikipedia/commons/3/3a/Tempura.jpg")
            )
        ),
        Restaurant(
            id = 15,
            name = "Wok & Roll",
            description = "Comida asiática de fusión con un toque moderno",
            category = "Comida Asiatica",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNlpgc1mIJnqI20_VzT39qGmbpQf8grbQdHw&s", // Stir fry
            menu = listOf(
                MenuItem(28, "Arroz Frito con Pollo", "Arroz frito con pollo, vegetales y salsa de soja", "https://upload.wikimedia.org/wikipedia/commons/9/9d/Chinese_Stir_Fry.jpg"),
                MenuItem(29, "Pollo a la Naranja", "Pollo rebozado en salsa de naranja", "https://upload.wikimedia.org/wikipedia/commons/0/0f/Chicken_with_orange_sauce.jpg"),
                MenuItem(30, "Rollos de Primavera", "Rollos de arroz rellenos de verduras y camarones", "https://upload.wikimedia.org/wikipedia/commons/3/3b/Spring_rolls.jpg")
            )
        ),
        Restaurant(
            id = 16,
            name = "Buddha Bowl",
            description = "Comida saludable asiática con opciones veganas",
            category = "Comida Asiatica",
            imageUrl = "https://static.vecteezy.com/system/resources/previews/005/073/225/non_2x/asian-food-logo-design-with-rustic-wok-icon-silhouette-and-heart-shape-smoke-symbol-combination-free-vector.jpg", // Buddha bowl
            menu = listOf(
                MenuItem(31, "Bowl de Tofu", "Tofu al estilo asiático con arroz integral y verduras", "https://upload.wikimedia.org/wikipedia/commons/6/6d/Buddha_bowl.jpg"),
                MenuItem(32, "Sopa Miso", "Sopa tradicional japonesa de miso con algas y tofu", "https://upload.wikimedia.org/wikipedia/commons/3/3e/Miso_soup.jpg"),
                MenuItem(33, "Ensalada de Algas", "Ensalada fresca con algas y pepino", "https://upload.wikimedia.org/wikipedia/commons/e/eb/Seaweed_salad.jpg")
            )
        ),
        Restaurant(
            id = 17,
            name = "Noodle House",
            description = "Platos tradicionales asiáticos de fideos y sopas",
            category = "Comida Asiatica",
            imageUrl = "https://images.vexels.com/media/users/3/224149/isolated/preview/b756fc623756755f70fc62068c7aef8e-logotipo-de-plato-asiatico.png", // Beef noodles
            menu = listOf(
                MenuItem(34, "Fideos con Carne", "Fideos chinos con carne de res y verduras", "https://upload.wikimedia.org/wikipedia/commons/e/ec/Beef_noodles.jpg"),
                MenuItem(35, "Sopa Pho", "Sopa vietnamita de fideos con carne de res y hierbas", "https://upload.wikimedia.org/wikipedia/commons/6/67/Pho_bowl.jpg"),
                MenuItem(36, "Pad Thai", "Fideos tailandeses con camarones, huevo y cacahuates", "https://upload.wikimedia.org/wikipedia/commons/9/92/Pad_Thai.jpg")
            )
        ),
        Restaurant(
            id = 18,
            name = "Healthy Bites",
            description = "Comida saludable, fresca y llena de nutrientes",
            category = "Comida Saludable",
            imageUrl = "https://img.freepik.com/vector-gratis/dibujar-mano-diseno-logotipo-comida-saludable_23-2149622351.jpg", // Ensalada
            menu = listOf(
                MenuItem(37, "Ensalada Verde", "Mezcla de lechugas, espinaca, tomate, pepino y aderezo", "https://upload.wikimedia.org/wikipedia/commons/5/52/Salad_bowl.jpg"),
                MenuItem(38, "Bowl de Acai", "Frutas frescas con acai, granola y miel", "https://upload.wikimedia.org/wikipedia/commons/3/39/Acai_bowl.jpg"),
                MenuItem(39, "Tartar de Salmón", "Salmón crudo con aguacate, pepino y sésamo", "https://upload.wikimedia.org/wikipedia/commons/5/53/Salmon_tartare.jpg")
            )
        ),
        Restaurant(
            id = 19,
            name = "Fit Food",
            description = "Comida sana, baja en calorías y llena de proteína",
            category = "Comida Saludable",
            imageUrl = "https://st3.depositphotos.com/4398873/12574/v/950/depositphotos_125746758-stock-illustration-organic-food-logo.jpg", // Healthy Meal
            menu = listOf(
                MenuItem(40, "Pollo a la Parrilla", "Pollo a la parrilla con verduras al vapor", "https://upload.wikimedia.org/wikipedia/commons/2/2f/Healthy_meal.jpg"),
                MenuItem(41, "Bowl de Quinoa", "Quinoa con verduras asadas, aguacate y semillas de chía", "https://upload.wikimedia.org/wikipedia/commons/6/6b/Quinoa_bowl.jpg"),
                MenuItem(42, "Smoothie Verde", "Smoothie con espinaca, pepino, manzana y limón", "https://upload.wikimedia.org/wikipedia/commons/7/79/Green_smoothie.jpg")
            )
        ),
        Restaurant(
            id = 20,
            name = "Green Life",
            description = "Comida plant-based y opciones veganas",
            category = "Comida Saludable",
            imageUrl = "https://static.vecteezy.com/system/resources/previews/004/557/295/non_2x/healthy-food-logo-design-template-inspiration-idea-concept-vector.jpg", // Healthy Vegetarian
            menu = listOf(
                MenuItem(43, "Bowl de Frutas", "Mezcla de frutas tropicales con yogur y granola", "https://upload.wikimedia.org/wikipedia/commons/5/55/Healthy_vegetarian_bowl.jpg"),
                MenuItem(44, "Hummus con Verduras", "Hummus con zanahorias, pepinos y apio", "https://upload.wikimedia.org/wikipedia/commons/c/c1/Hummus_and_vegetables.jpg"),
                MenuItem(45, "Wrap de Vegetales", "Wrap con espinaca, aguacate, pepino y hummus", "https://upload.wikimedia.org/wikipedia/commons/9/99/Vegetable_wrap.jpg")
            )
        ),
        Restaurant(
            id = 21,
            name = "Vegan Bistro",
            description = "Comida vegana saludable y deliciosa",
            category = "Comida Saludable",
            imageUrl = "https://previews.123rf.com/images/butenkow/butenkow1604/butenkow160400380/55538013-patr%C3%B3n-de-logotipo-de-la-alimentaci%C3%B3n-saludable-ilustraci%C3%B3n-vectorial.jpg", // Vegan Burger
            menu = listOf(
                MenuItem(46, "Hamburguesa Vegana", "Hamburguesa de garbanzos con aguacate y lechuga", "https://upload.wikimedia.org/wikipedia/commons/4/4a/Vegan_burger.jpg"),
                MenuItem(47, "Sopa de Lentejas", "Sopa vegana de lentejas con espinaca", "https://upload.wikimedia.org/wikipedia/commons/5/53/Vegetable_soup.jpg"),
                MenuItem(48, "Tacos Veganos", "Tacos con tofu, aguacate, cebolla y cilantro", "https://upload.wikimedia.org/wikipedia/commons/6/64/Tacos_veganos.jpg")
            )
        ),Restaurant(
            id = 22,
            name = "Café del Mundo",
            description = "Café y bebidas gourmet para todos los gustos",
            category = "Bebidas",
            imageUrl = "https://static.vecteezy.com/system/resources/previews/008/522/478/non_2x/coffee-drink-logo-design-vector.jpg", // Taza de café
            menu = listOf(
                MenuItem(61, "Café Americano", "Café espresso con agua caliente", "https://upload.wikimedia.org/wikipedia/commons/9/97/Coffee_cup.jpg"),
                MenuItem(62, "Cappuccino", "Café con leche y espuma de leche", "https://upload.wikimedia.org/wikipedia/commons/2/29/Cappuccino.jpg"),
                MenuItem(63, "Frappuccino", "Bebida fría de café con hielo y crema", "https://upload.wikimedia.org/wikipedia/commons/f/fb/Frappuccino.jpg")
            )
        ),
        Restaurant(
            id = 23,
            name = "Bebidas Naturales",
            description = "Jugos frescos y naturales, perfectos para cualquier momento",
            category = "Bebidas",
            imageUrl = "https://img.freepik.com/vector-premium/naranja-logotipo-bebida-bebida_1166763-12593.jpg?semt=ais_hybrid&w=740", // Jugo natural
            menu = listOf(
                MenuItem(64, "Jugo de Naranja", "Jugo fresco de naranja recién exprimida", "https://upload.wikimedia.org/wikipedia/commons/1/1b/Fresh_juice.jpg"),
                MenuItem(65, "Smoothie de Mango", "Smoothie cremoso de mango con yogurt", "https://upload.wikimedia.org/wikipedia/commons/5/56/Mango_smoothie.jpg"),
                MenuItem(66, "Limonada", "Limonada refrescante con toque de menta", "https://upload.wikimedia.org/wikipedia/commons/8/80/Lemonade.jpg")
            )
        ),
        Restaurant(
            id = 24,
            name = "Café & Té",
            description = "Combinación de tés y cafés premium con un toque único",
            category = "Bebidas",
            imageUrl = "https://static.vecteezy.com/system/resources/previews/025/751/708/non_2x/coffee-cup-logo-design-template-hot-drinks-coffee-logotype-concept-icon-vector.jpg", // Té
            menu = listOf(
                MenuItem(67, "Té Verde", "Té verde refrescante y antioxidante", "https://upload.wikimedia.org/wikipedia/commons/1/17/Tea_cup.jpg"),
                MenuItem(68, "Té Chai", "Té especiado con leche y especias", "https://upload.wikimedia.org/wikipedia/commons/f/fd/Chai_tea.jpg"),
                MenuItem(69, "Café Latte", "Café con leche espumosa", "https://upload.wikimedia.org/wikipedia/commons/7/74/Caff%C3%A9_Latte.jpg")
            )
        ),
        Restaurant(
            id = 25,
            name = "La Barra",
            description = "Bebidas alcohólicas y cócteles para disfrutar con amigos",
            category = "Bebidas",
            imageUrl = "https://www.shutterstock.com/image-vector/beer-delivery-logo-design-illustration-600nw-1878048211.jpg", // Cóctel
            menu = listOf(
                MenuItem(70, "Mojito", "Cóctel de ron, menta, lima y azúcar", "https://upload.wikimedia.org/wikipedia/commons/a/a6/Cocktail_with_ice.jpg"),
                MenuItem(71, "Margarita", "Cóctel de tequila, lima y licor de naranja", "https://upload.wikimedia.org/wikipedia/commons/1/15/Margarita.jpg"),
                MenuItem(72, "Piña Colada", "Cóctel de ron, piña y crema de coco", "https://upload.wikimedia.org/wikipedia/commons/d/d1/Pina_colada.jpg")
            )
        ),
        Restaurant(
            id = 26,
            name = "McDonald's",
            description = "Las clásicas hamburguesas y papas fritas que te encantan",
            category = "Comida Rapida",
            imageUrl = "https://1000marcas.net/wp-content/uploads/2019/11/McDonalds-logo.png", // Logo de McDonald's
            menu = listOf(
                MenuItem(9, "Big Mac", "Hamburguesa con dos carnes, salsa especial, lechuga, queso, pepinillos y cebolla", "https://upload.wikimedia.org/wikipedia/commons/3/32/Big_Mac.jpg"),
                MenuItem(10, "Papas Fritas", "Papas fritas crujientes y saladas", "https://upload.wikimedia.org/wikipedia/commons/2/29/French_fries.jpg"),
                MenuItem(11, "McFlurry", "Helado con trozos de chocolate y caramelo", "https://upload.wikimedia.org/wikipedia/commons/5/5d/McFlurry.jpg")
            )
        ),
        Restaurant(
            id = 27,
            name = "KFC",
            description = "Pollo frito crujiente y jugoso con un sabor único",
            category = "Comida Rapida",
            imageUrl = "https://thumbs.dreamstime.com/b/kfc-logo-vector-icono-ilustraci%C3%B3n-vectorial-editable-del-restaurante-de-pollo-sobre-fondo-blanco-aislado-219165309.jpg", // Logo de KFC
            menu = listOf(
                MenuItem(12, "Bucket de Pollo", "Pieza de pollo frito con papas fritas y ensalada", "https://upload.wikimedia.org/wikipedia/commons/2/2f/KFC_bucket.jpg"),
                MenuItem(13, "Zinger", "Hamburguesa con pollo crujiente, lechuga, mayonesa y salsa picante", "https://upload.wikimedia.org/wikipedia/commons/4/42/Zinger.jpg"),
                MenuItem(14, "Papas Fritas", "Papas fritas crujientes con sal", "https://upload.wikimedia.org/wikipedia/commons/8/87/KFC_fries.jpg")
            )
        ),
        Restaurant(
            id = 28,
            name = "Subway",
            description = "Sándwiches frescos con ingredientes seleccionados por ti",
            category = "Comida Rapida",
            imageUrl = "https://bambucitycenter.com/wp-content/uploads/2024/04/Subway-1024x1024.png", // Logo de Subway
            menu = listOf(
                MenuItem(15, "Sándwich de Pollo al Horno", "Sándwich con pechuga de pollo, lechuga, tomate, cebolla y mayonesa", "https://upload.wikimedia.org/wikipedia/commons/2/23/Subway_sandwich.jpg"),
                MenuItem(16, "Sub de Pavo", "Sándwich con pavo, queso, lechuga, espinacas y mostaza", "https://upload.wikimedia.org/wikipedia/commons/3/36/Subway_pavo.jpg"),
                MenuItem(17, "Wrap de Vegetales", "Wrap con vegetales frescos, hummus y salsa de yogurt", "https://upload.wikimedia.org/wikipedia/commons/6/6f/Subway_wrap.jpg")
            )
        ),

    )
}
