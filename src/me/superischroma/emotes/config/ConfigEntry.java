package me.superischroma.emotes.config;

public enum ConfigEntry 
{
    
    SERVER_NAME(String.class, "server.name");
    
    private final Class<?> type;
    private final String configName;
    
    ConfigEntry(Class<?> type, String configName)
    {
        this.type = type;
        this.configName = configName;
    }

    public Class<?> getType()
    {
        return type;
    }

    public String getConfigName()
    {
        return configName;
    }
    
}
