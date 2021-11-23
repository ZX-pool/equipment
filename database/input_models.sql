
INSERT INTO manufacturer (name, about) VALUES 
	('ZTE', 'multibrand'), #1
    ('Huawei','multibrand'), #2
    ('Novatel', 'from USA'), #3
    ('Evdo-link', 'Ukrainian brand from EvdoShop'), #4
    ('Netgear', 'for American operator Sprint'); #5
INSERT INTO model_type (name, about) VALUES
	('modem','for computers with USB or routers wih USB only'), #1
    ('USB WiFi router','modem + WiFi router. Input to any USB port or USB charger'), #2
    ('mobile WiFi router','modem + WiFi + battary router. Mobile router. Charging with microUSB charger'), #3
    ('LAN WiFi router','Stationary router with LAN ports. Not mobile.'); #4
INSERT INTO external_antenna_type (name, about) VALUES
	('No','No connector for plugin external antenna'), #1
    ('CRC9','often in Huawei modems or routers except stationary routers'), #2
    ('TS9','most often use in any modems and routers except stationary routers'), #3
    ('SMA','for stationary routers '), #4
    ('MS-156', 'for modems and routers like Novatel 2200, Franclin U301, Evdo-link 3277'); #5
INSERT INTO supported_technologies (name, about) VALUES
	('3G','3G up to 42 MBit/s'), #1
    ('4G LTE','up to 150 MBit/s'), #2
    ('4G LTE band 8','additional support LTE band 8'); #3
INSERT INTO model (name, manufacturer_id, model_type_id, external_antenna_type_id, supported_technologies_id) VALUES
	('Jetpack 6620L', 3, 3, 3, 2),
    ('Jetpack 4620L', 3, 3, 3, 1),
    ('el 3277', 4, 1, 5, 1),
    ('el 8377', 4, 2, 2, 2),
	('E3276s-920', 2, 1, 2, 1),
    ('MF 70', 1, 2, 3, 1),
    ('MF 79U', 1, 2, 3, 3),
    ('MF 90', 1, 3, 3, 3),
    ('AirCard AC782S', 5, 3, 3, 3),
    ('MF 283U', 1, 4, 4, 2),
    ('B593U-12', 2, 4, 4, 3);
    
INSERT INTO supplier (name, about) VALUES
	('EvdoShop', 'Kharkiv'),
    ('Smart Solutions','Kyiv'),
    ('Vasil','Yuhimovich');
INSERT INTO equipment_status (name) VALUES
	('склад'), ('вітрина'), ('продан');



INSERT INTO dealer (name, about) VALUES
	('ЗахідТелеком','магазин пр. Миру 12, вхід з двору 068-036-77-67'),
    ('Саша Борове','Борове 068-912-34-00'),
    ('Грель Володя','Дубно, Віасат, супутникі, відеонагляд 067-450-97-84 або 050-375-25-08 '),
    ('Олег Костопіль','Олег Кундос м. Костопіль т.067-364-33-12, kolega@ukr.net');


    
    