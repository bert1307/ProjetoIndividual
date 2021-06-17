#language: pt

Funcionalidade: Formulario de Seguro de Automovel
	Preencher abas do formulario de Seguro de Automovel 

  Cenario: Preencher aba enter Vehicle Data
    Dado que estou no site "http://sampleapp.tricentis.com/101/app.php"
    E seleciono uma opcao no campo make 
    E escrevo no proximo campo enginee performance "70"
    E escrevo no proximo campo date 
    E seleciono para escolher uma opcao no campo number of seats
    E seleciono para escolher uma opcao no campo fuel type
    E escrevo no proximo campo list price "25000"
    E escrevo no proximo campo license plate number "ABC123"
    E escrevo no proximo campo annual mileage "2000"
    Entao clico no botao
    
  Cenario: Preencher aba enter Insurance Data
		Dado que escrevo no campo first name "Samantha"
		E escrevo no campo last name "Bertozzi"
		E escrevo no campo date of birth "07/13/1992"
		E clico no botao do gender
		E seleciono o campo country 
		E escrevo no campo zip code "01152010"
		E seleciono o campo occupation
		E escolho o campo hobbies
		Entao clico no segundo botao 
		
	Cenario: Preencher aba enter Product Data
		Dado que escrevo no campo start date "09/16/2021"
		E seleciono o campo Insurance Sum
		E seleciono o campo Merit Rating
		E seleciono o campo Damage Insurance
		E escolho uma opcao no campo Optional Products
		E seleciono o campo Courtesy car
		Entao clico no terceiro botao 
		
	Cenario: Preencher aba Select Price Option
	Dado que eu seleciono o preco
	Entao clico no quarto botao
	
	Cenario: Preencher aba Send Quote
	Dado que digito o email "email@hotmail.com"
	E digito no campo phone "999999999"
	E digito no campo username "nameUser"
	E digito no campo password "User12345"
	E confirmo a senha "User12345"
	E digito um comentario "finishTest"
	E clico no ultimo botao
	Entao deve aparecer a mensagem de "Sending e-mail success!" 		  
				
