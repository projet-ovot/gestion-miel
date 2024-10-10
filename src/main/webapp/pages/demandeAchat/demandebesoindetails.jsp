<%-- 
    Document   : demandebesoindetails
    Created on : Oct 10, 2024, 2:33:02 PM
    Author     : superharivony
--%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire Produits</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            padding: 50px;
        }
        .form-container {
            max-width: 400px;
            margin: auto;
            padding: 20px;
            background-color: white;
            border: 1px solid #dee2e6;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        select, input[type="number"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #dee2e6;
            border-radius: 5px;
            background-color: transparent;
            box-sizing: border-box;
            transition: border-color 0.3s;
        }
        select:focus, input[type="number"]:focus {
            border-color: #80bdff;
            outline: none;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #17791a;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        button:hover {
            background-color: #2a5c28;
        }
    </style>
</head>
<body>

<div class="form-container">
    <form method="POST" action="/submit">
        <div class="form-group">
            <label for="produits">Produits</label>
            <select id="produits" name="produits">
                <option value="produit1">Produit 1</option>
                <option value="produit2">Produit 2</option>
                <option value="produit3">Produit 3</option>
                <option value="produit4">Produit 4</option>
            </select>
        </div>

        <div class="form-group">
            <label for="quantite">Quantité</label>
            <input type="number" id="quantite" name="quantite" min="1" max="100" required>
        </div>

        <button type="submit">Soumettre</button>
    </form>
</div>

</body>
</html>
