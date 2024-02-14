import pygame 
pygame.init() 

# Creating window 
gameWindow = pygame.display.set_mode((800, 300)) 
pygame.display.set_caption("Event Handling") 


exit_game = False
game_over = False

# Creating a game loop 
while not exit_game: 
	for event in pygame.event.get(): # For Loop 
		if event.type == pygame.QUIT: 
			exit_game = True

		if event.type == pygame.KEYDOWN: 
			if event.key == pygame.K_RIGHT: 
				print("You have pressed right arrow key") 
			elif event.key == pygame.K_LEFT: 
				print("You have pressed left arrow key") 

pygame.quit() 
quit() 
