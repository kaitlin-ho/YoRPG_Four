# TNPG: Team Four

## Roster: Fang Chen, Kaitlin Ho, Jing Yi Feng, Cat, Apple, Biscuit

New classes:
- Monster subclasses: Goblin, Giant, Zombie
  - Goblin:  A monster subclass that has low HP and low defense, high damage.
  - Zombie: A monster subclass that has average HP and average defense, does low damage.
  - Giant: A monster subclass that has high HP and low defense, and does high damage. Is luckier than the other monsters.
- Protagonist subclasses: Mage, Brawler, Tank
  - Mage: A protagonist subclass that has low hp and low defense, but makes up for it with high magic damage
  - Brawler: A protagonist subclass that has average hp, defense, and attack; the role is all-rounded, but doesn't have a special area of focus
  - Tank: A protagonist subclass that has high hp and high defense, but does little damage per turn

Summary of version to version modification:
- Simplification of Monster and Protagonist classes by cutting down code
- New classes created
- Updated newGame() in YoRPG.java to add Protagonist role choices
- Changed the driver so Protagonist classes can be chosen and Monster classes appear in-game.
- Balance changes of stats and skills (of Protagonist and Monsters)

Ways we would want to grow this game in the future:
- Add more stats! An example would be agility/speed (chance to evade an attack or chance to take less damage from one)
- More sub-roles for the adventurer; greater variety for monsters (they can have special skills too). New class with the ability to revive themselves (maybe: if the class casts the revival spell and their HP stays above 0 the next turn, they die.) 
- Fine details & hidden features: chances of specific things triggering, like a monster with special stats
- Add a bot that plays alongside you. Their class would be randomized and would take advantage of support classes like healers.

