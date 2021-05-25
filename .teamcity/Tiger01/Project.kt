package Tiger01

import Tiger01.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01")
    name = "Tiger01"

    buildType(Tiger01_Hi3)
    buildType(Tiger01_Hi2)
    buildType(Tiger01_Hi1)
    buildType(Tiger01_Hi0)

    subProject(Tiger0119.Project)
    subProject(Tiger018.Project)
    subProject(Tiger019.Project)
    subProject(Tiger010.Project)
    subProject(Tiger0111.Project)
    subProject(Tiger011.Project)
    subProject(Tiger0112.Project)
    subProject(Tiger0113.Project)
    subProject(Tiger012.Project)
    subProject(Tiger0114.Project)
    subProject(Tiger013.Project)
    subProject(Tiger0115.Project)
    subProject(Tiger014.Project)
    subProject(Tiger0116.Project)
    subProject(Tiger015.Project)
    subProject(Tiger0117.Project)
    subProject(Tiger016.Project)
    subProject(Tiger0118.Project)
    subProject(Tiger017.Project)
    subProject(Tiger0110.Project)
})
