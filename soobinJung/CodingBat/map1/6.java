package soobinJung.CodingBat.map;
public Map<String, String> topping3(Map<String, String> map) {
    if (map.containsKey("salad")) {
      map.put("spinach", map.get("salad"));
    }
    if (map.containsKey("potato")) {
      map.put("fries", map.get("potato"));
      return map;
    }
    return map;
  }
