package Tiger0115

import Tiger0115.buildTypes.*
import Tiger0115.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0115")
    name = "Tiger0115"

    vcsRoot(Tiger0115_cVCSroot)

    buildType(Tiger0115_Hi0)
    buildType(Tiger0115_Hi1)
    buildType(Tiger0115_Hi2)
    buildType(Tiger0115_Hi3)
})
