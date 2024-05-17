# Vtora laboratoriska vezba po Softversko inzenerstvo
## Ilija Manevski, br. na indeks 226045

![CFG](https://github.com/0226045/SI_2024_lab2_226045/assets/138158821/d1999ec6-883d-4bd0-8590-4d6e4a782754)

3. Za presmetuvanje na ciklomatskata kompleksnost za dadeniot kod, potrebno e da se izbrojat site regioni vo nacrtaniot graf. Pa taka, se dobiva ciklomatska kompleksnost koja iznesuva deset.

4. Spored Every Branch kriteriumot vo prilog ja imame slednata tabela:

   ![table1](https://github.com/0226045/SI_2024_lab2_226045/assets/138158821/05486d77-45a5-459a-825a-2da9b78a3657)
   
Vo prviot slucaj gi zadavame slednite vrednosti:  'pay: 100' item1_price = 40 | sum = 40(item1_price) i sledniot pat kade 'i = 1' i 'i < 2' za item2_price=40 , sum =                                                   sum + item2_price -> sum = 80 | sum < pay (80 < 100)

Vo vtoriot slucaj gi zadavame slednite vrednosti: 'pay: 100' itemPrice = 4000 | sum = 4000(itemPrice) * 0.1(discount) = 400 | 'sum = 370' | sum > pay (370 > 100)

Za slednite slucai ni preostana da gi opfatime isklucocite. Toa go pravime so zadavanje na slednite vrednosti, i toa za:

   - tretiot test slucaj: itemSize = 0. Dopolnitelno ova e i prviot isklucok cija mestopolozba e na samiot start na funkcijata,... vednas ke bide opfaten.
   - cetvrtiot test slucaj: Barkodot mora da sordzi karakter koja e nadvor od opsegot na onie karakteri koi se dozvoleni. Primer za takov karakter e -1.
   - petiot test slucaj: Voopsto nema barkod.


5. Site test slucai spored Multiple Condition kriteriumot za uslovot if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)== '0') se:

 ![table2](https://github.com/0226045/SI_2024_lab2_226045/assets/138158821/ab951580-e2e4-4283-935f-71004a2dcb1b)
