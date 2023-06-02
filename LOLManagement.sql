-- create the database
CREATE DATABASE LOLManagement;

-- switch to the new database
USE LOLManagement;

-- create the Champion table
CREATE TABLE Champion (
  ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  Name VARCHAR(50) NOT NULL,
  Story VARCHAR(500) NOT NULL
);

-- create the Skin table
CREATE TABLE Skin (
  ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  ChampionID INT NOT NULL,
  Name VARCHAR(50) NOT NULL,
  Price INT NOT NULL,
  FOREIGN KEY (ChampionID) REFERENCES Champion(ID)
);

-- create the Skill table
CREATE TABLE Skill (
  ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  ChampionID INT NOT NULL,
  Description1 VARCHAR(255) NOT NULL,
  Description2 VARCHAR(255) NOT NULL,
  Description3 VARCHAR(255) NOT NULL,
  Description4 VARCHAR(255) NOT NULL,
  FOREIGN KEY (ChampionID) REFERENCES Champion(ID)
);

-- create the Item table
CREATE TABLE Item (
  ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  Name VARCHAR(50) NOT NULL,
  Price INT NOT NULL,
  Description VARCHAR(255) NOT NULL
);

-- create the User table
CREATE TABLE [User] (
  ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  Email VARCHAR(100) NOT NULL,
  Password VARCHAR(50) NOT NULL,
  Rank VARCHAR(50) NOT NULL,
  Role BIT
);


-- insert data into Champion table
INSERT INTO Champion VALUES
	('Ashe', 'Ashe is the Frost Archer and the leader of the Avarosan tribe. She has a noble heart and a fierce spirit, and is revered by her people as a symbol of hope.'),
	('Darius', 'Darius is a proud and ruthless Noxian warrior. Once a member of the prestigious Lightshield family, he sought glory and power through the ranks of the military, eventually gaining command of Noxus''s armies.'),
	('Ezreal', 'Ezreal is a brash and cocky adventurer who has explored some of the most remote and abandoned locations on Runeterra. His exploits have earned him fame and fortune, as well as the attention of those seeking to harness his knowledge.'),
	('Lux', 'Luxanna Crownguard is a mage from Demacia who commands light magic. She is the youngest daughter of the Crownguard family, one of the most prestigious and powerful families in Demacia.'),
	('Yasuo', 'Yasuo is a proud and skilled swordsman who once fought alongside his master and friend, Yone. However, when Yone was killed, Yasuo was blamed and forced to flee his homeland in shame.');

-- insert data into Skin table
INSERT INTO Skin (ChampionID, Name, Price)
VALUES	(1, 'Sherwood Forest Ashe', 975),
		(1, 'Heartseeker Ashe', 1350),
		(1, 'High Noon Ashe', 1350),
		(2, 'Dunkmaster Darius', 1820),
		(2, 'High Noon Darius', 1350),
		(2, 'God-King Darius', 1820),
		(3, 'Pulsefire Ezreal', 3250),
		(3, 'Arcade Ezreal', 1350),
		(3, 'Star Guardian Ezreal', 1350),
		(4, 'Elementalist Lux', 3250),
		(4, 'Star Guardian Lux', 1350),
		(4, 'Battle Academia Lux', 1820),
		(5, 'High Noon Yasuo', 1350),
		(5, 'Blood Moon Yasuo', 1350),
		(5, 'Nightbringer Yasuo', 1820);

-- insert data into Skill table
INSERT INTO Skill (ChampionID, Description1, Description2, Description3, Description4)
VALUES (1, 'Fires an arrow that deals physical damage to the first enemy hit. Deals bonus damage to minions and monsters.', 'Fires a bolt of energy that deals magic damage to the first enemy hit and grants vision of the surrounding area. Allies hit by the bolt are also granted bonus attack speed.', 'Passive: Hitting an enemy with a spell or basic attack marks them with Essence Theft. Killing a marked enemy or scoring an assist on them restores mana and grants a brief burst of movement speed.', 'Fires a barrage of arrows that deal physical damage to all enemies in a cone. Can be charged up for increased range and damage.'),
	   (2, 'Fires a sonic wave that deals physical damage to the first enemy hit. Can be followed up with Resonating Strike.', 'Dashes to a target ally or ward. Can be followed up with Iron Will.', 'Flurry of Blows', 'Every third basic attack deals bonus physical damage and applies a slow to the target. Can be followed up with either an empowered attack that deals additional damage, or a dash that makes Lee Sin briefly untargetable.'),
	   (3, 'Attaches a bomb to an enemy that detonates after a short delay, dealing magic damage to all nearby enemies. Can be recast to detonate the bomb early.', 'Resets the cooldowns of Zilean''s basic abilities by a short amount.', 'Targeted ability that either speeds up an ally or slows down an enemy. Can be used twice before going on cooldown.', 'Targets an allied champion, rendering them untargetable and invulnerable for a brief period. When they reappear, they are healed for a large amount of health.'),
	   (4, 'Throws a boomerang that deals physical damage to all enemies it passes through, then returns to Sivir, dealing damage again to enemies in its path. Deals bonus damage to minions and monsters.', 'Sivir''s next basic attack bounces to nearby enemies, dealing reduced damage to each subsequent target hit.', 'Sivir gains bonus attack speed when attacking enemy champions. Active: Sivir blocks the next incoming enemy ability and gains mana if successful.', 'Grants bonus movement speed and attack speed to Sivir and nearby allied champions for a short duration.'),
	   (5, 'Charges up a shot that deals physical damage to the first enemy hit, based on how long it was charged. Deals reduced damage to subsequent targets.', 'Varus''s basic attacks deal bonus magic damage and apply Blight. Active: Varus''s next Piercing Arrow deals bonus damage and spreads Blight to all enemies hit.', 'Fires a volley of arrows at a target area, dealing physical damage and applying a slow to enemies within the area. Enemies standing on the arrows are also snared.', 'Fires a death. He manipulates time to prevent disasters and change the course of history, though his methods are often enigmatic and unpredictable.');

-- insert data into Item table
INSERT INTO Item (Name, Price, Description)
VALUES ('Infinity Edge', 3400, 'Grants bonus critical strike damage and critical strike chance.'),
	   ('Rabadon''s Deathcap', 3800, 'Grants bonus ability power.'),
	   ('Dead Man''s Plate', 2900, 'Grants bonus health and armor, as well as a passive that increases movement speed and empowers your next basic attack.'),
	   ('Mercury''s Treads', 1100, 'Grants bonus magic resist and tenacity.'),
	   ('Guardian Angel', 2800, 'Grants bonus attack damage and armor, as well as a passive that revives you upon death with a portion of your health and mana.');

-- insert data into User table
INSERT INTO [User] (Email, Password, Rank, Role)
VALUES ('john.doe@example.com', 'password123', 'Silver III', 1),
	   ('jane.doe@example.com', 'qwerty123', 'Gold II', 0),
	   ('jim.smith@example.com', 'abc123', 'Bronze IV', 0),
	   ('steve.johnson@example.com', 'password456', 'Platinum I', 0),
	   ('emily.brown@example.com', 'letmein123', 'Diamond III', 1);

