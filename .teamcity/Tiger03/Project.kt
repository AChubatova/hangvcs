package Tiger03

import Tiger03.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger03")
    name = "Tiger03"

    buildType(Tiger03_Hi1)
    buildType(Tiger03_Hi0)
    buildType(Tiger03_Hi3)
    buildType(Tiger03_Hi2)

    subProject(Tiger0317.Project)
    subProject(Tiger0318.Project)
    subProject(Tiger0319.Project)
    subProject(Tiger032.Project)
    subProject(Tiger0310.Project)
    subProject(Tiger033.Project)
    subProject(Tiger0311.Project)
    subProject(Tiger034.Project)
    subProject(Tiger0312.Project)
    subProject(Tiger035.Project)
    subProject(Tiger0313.Project)
    subProject(Tiger036.Project)
    subProject(Tiger0314.Project)
    subProject(Tiger037.Project)
    subProject(Tiger0315.Project)
    subProject(Tiger038.Project)
    subProject(Tiger0316.Project)
    subProject(Tiger039.Project)
    subProject(Tiger030.Project)
    subProject(Tiger031.Project)
})
