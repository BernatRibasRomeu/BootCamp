select a.address_id, a.address, a.address2, a.district, a.city_id, a.postal_code, a.phone, a.location, a.last_update,
	c.city, c.last_update, co.country, co.last_update from address a
inner join 
	city c on a.city_id = c.city_id
inner join
	country co on c.city_id = co.country_id;