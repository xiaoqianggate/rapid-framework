<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   

package ${basepackage}.facade;

import cn.org.rapid_framework.util.PageList;

import ${basepackage}.dal.query.${className}Query;
import ${basepackage}.repository.model.${className};

public interface ${className}Facade  {
    
    public void update${className}(${className} ${classNameLower});
    
    public ${className} create${className}(${className} ${classNameLower});
    
    public void remove${className}ById(Long id);
    
    public ${className} query${className}ById(Long id);
    
    public PageList<${className}> findPage(${className}Query query);
    
}
