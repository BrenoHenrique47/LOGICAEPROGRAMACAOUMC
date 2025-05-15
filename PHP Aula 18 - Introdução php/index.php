<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Meu primeiro programa</title>
</head>

<body>
    <h1>
        <?php
            echo "Olá, Mundo!";
        ?>
    </h1>

    <?php 
        echo "<h1> Olá, Mundo! </h1>"
    ?>

    <h2> <hr> Variáveis em PHP </h2>

    <p>
        <?php 
            $nome = "Breno ";
            $email = "breno@gmail.com";

            echo "Nome: $nome <br>";
            echo "Email: $email <br>";

        ?>
    </p>

    <h2> <hr> Constantes em PHP </h2>
    <p>
        <?php 
            const faculdade = "UMC";
            const cidade ="Mogi das Cruzes";

            echo "Faculdade: " . faculdade . "<br>";
            echo "Faculdade: " . cidade . "<br>";
        ?>
    </p>

</body>

</html>