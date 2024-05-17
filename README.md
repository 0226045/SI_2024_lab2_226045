# Vtora laboratoriska vezba po Softversko inzenerstvo
## Ilija Manevski, br. na indeks 226045

2. ![CFG](https://github.com/0226045/SI_2024_lab2_226045/assets/138158821/d1999ec6-883d-4bd0-8590-4d6e4a782754)

3. Za presmetuvanje na ciklomatskata kompleksnost za dadeniot kod, potrebno e da se izbrojat site regioni vo nacrtaniot graf. Pa taka, se dobiva ciklomatska kompleksnost koja iznesuva deset.

4. Spored Every Branch kriteriumot vo prilog ja imame slednata tabela:

Branch / Test cases |	itemSize:2 - pay:10	| itemSize:1 - pay:100 | itemSize:0 - pay:100 |	itemSize:1 - pay:100 | itemSize:1 - pay:100 | disjunkcija	
51-52				                    1	               		  1                			 1	                		1	                		 1          		   1
52-53				                    0		               	  0                			 1		  	              0                			 0          		   1
52-56				                    1			                1			                 0                  		1                 		 1          		   1
53-92				                    0		              	  0                			 1                			0                			 0          		   1
56-58.1				                  1			                1                			 0                			1                			 1          		   1
58.1-58.2			                  1			                1		                   0                			1                  		 1	          	   1
58.2-59(60)			                1			                1			                 0	                		1                 		 1	          	   1
59(60)-61			                  0			                1	                  	 0                			0	                   	 0	          	   1
61-63				                    0			                1                  		 0			                0			                 0	          	   1
59(60)-63			                  1			                0			                 0                			1		                 	 1          		   1
63-80				                    0			                0			                 0			                0                 		 1	         	     1
80-92				                    0			                0	                		 0		              	  0	                		 1        		     1
63-64(65)			                  1			                1                			 0		                	1	                  	 0          		   1
64(65)-66.1			                1			                1                  		 0	                		1	                  	 0           	     1
66.1-66.2			                  1			                1                 		 0                 			1	                     0	          	   1
66.2-67(68)			                1			                1                  		 0                 			1                  		 0	          	   1
67(68)-66.3			                1			                1	                  	 0                 			0		                 	 0         		     1
66.3-66.2			                  1			                1                  		 0                			0	                 		 0	         	     1
67(68)-69			                  0			                0                 		 0	                		1                  		 0	          	   1
69-92				                    0			                0	                 		 0			                1	                  	 0		             1
66.2-72				                  1			                1			                 0		                	0	                		 0		             1
72-73				                    0			                1			                 0                 			0			                 0		             1
72-76				                    1			                0		                   0                			0			                 0		             1
73-82				                    0			                1			                 0	                 		0			                 0		             1
76-82				                    1			                0			                 0                 			0			                 0		             1
82-83				                    0			                1			                 0                			0			                 0         		     1
82-58.3                         1			                0			                 0                			0			                 0		             1		
83-58.3				                  0			                1			                 0                 			0			                 0		             1
58.3-58.2			                  1			                1			                 0                			0			                 0		             1
58.2-86				                  1			                1			                 0			                0			                 0		             1
86-87				                    1			                0			                 0		                	0			                 0		             1
86-90				                    0			                1			                 0			                0			                 0		             1
90-92				                    0			                1			                 0			                0			                 0		             1
87-92				                    1			                0			                 0			                0			                 0		             1

Vo prviot slucaj gi zadavame slednite vrednosti:  'pay: 100' item1_price = 40 | sum = 40(item1_price) i sledniot pat kade 'i = 1' i 'i < 2' za item2_price=40 , sum = sum + item2_price -> sum = 80 |
                                                  sum < pay (80 < 100)
Vo vtoriot slucaj gi zadavame slednite vrednosti: 'pay: 100' itemPrice = 4000 | sum = 4000(itemPrice) * 0.1(discount) = 400 | 'sum = 370' | sum > pay (370 > 100)

Za slednite slucai ni preostana da gi opfatime isklucocite. Toa go pravime so zadavanje na slednite vrednosti, i toa za:

	- tretiot test slucaj: itemSize = 0. Dopolnitelno ova e i prviot isklucok cija mestopolozba e na samiot start na funkcijata,... vednas ke bide opfaten.
	- cetvrtiot test slucaj: Barkodot mora da sordzi karakter koja e nadvor od opsegot na onie karakteri koi se dozvoleni. Primer za takov karakter e -1.
	- petiot test slucaj: Voopsto nema barkod.

5. Site test slucai spored Multiple Condition kriteriumot za uslovot if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)== '0') se:

   p q r | p&&q&&r   ->    p q r
 
   T T T |    T            T T T   dokolku site se tocni, uslovot ke bide tocen     
   T T F |    F      	     F X X   dokolku prvoto e netocno, sekako uslovot ke bide netocen, pa taka slednite ne se vazni voopsto
   T F T |    F       	   T F X   dokolku prvoto e tocno, a vtoroto ne, togas tretoto e nebitno, pa uslovot ke e netocen
   T F F |    F      	     T T F   dokolku prvoto i vtoroto e tocno, a tretoto netocno, soodvetno i uslovot ke e netocen
   F T T |    F
   F T F |    F
   F F T |    F
   F F F |    F
